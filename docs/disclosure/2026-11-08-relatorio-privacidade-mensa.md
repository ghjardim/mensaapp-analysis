# Relatório de privacidade: app Mensa Brasil 7.7.0 (Android)

**Para:** Encarregado(a) de Proteção de Dados (DPO) e equipe de desenvolvimento do app, Mensa Brasil
**De:** Guilherme H. Jardim (associado)
**Data:** 08/11/2026
**Classificação:** comunicação privada. Não divulgar antes da correção.

## Resumo

Fiz uma análise **estática** do app Mensa Brasil 7.7.0 (`com.mensabrasil.app`, versionCode 141),
instalado pela Play Store no meu próprio aparelho. Li apenas o código do APK. **Nenhuma requisição foi
enviada à API da Mensa nem ao projeto Firebase**, e nenhum controle do servidor foi testado.

O app é, no geral, bem comportado: não há coleta oculta, rastreamento de localização, fingerprinting
de dispositivo nem SDKs de publicidade. Encontrei, porém, **um problema que merece correção
rápida**:

> **O app envia o e-mail do usuário ao Google Analytics**, junto com a situação da associação
> (expirada, inativa, não cadastrado, e-mail não-Mensa) e o UID do Firebase.

A correção é simples: remover um parâmetro em 4 ações do FlutterFlow. Mais abaixo listo outros
ajustes de baixo custo.

## 1. Achado principal: e-mail no Google Analytics

Na página de login, quatro eventos personalizados do Firebase Analytics incluem o e-mail do usuário
logado como parâmetro:

| Evento | Parâmetro | Valor |
|---|---|---|
| `usernotregistered` | `Param 1` | e-mail do usuário (`currentUserEmail`) |
| `LoginExpiredUser` | `Email` | e-mail do usuário |
| `InactiveMember` | `Email` | e-mail do usuário |
| `NotMensaEmail` | `Email` | e-mail do usuário |

O wrapper padrão do FlutterFlow (`logFirebaseEvent`) também acrescenta o parâmetro `user` com o UID
do Firebase em todos os eventos.

**Por que importa**
- Os termos do Google Analytics proíbem o envio de informações pessoais identificáveis, como
  endereços de e-mail.
- Pela LGPD, é compartilhamento de dado pessoal com um operador (Google) que vai além do
  necessário (art. 6º, I e III): para contar falhas de login, o nome do evento basta.
- O dado associa uma pessoa identificável à sua situação na associação.

**Correção sugerida**
1. Nas 4 ações "Google Analytics Event" da página de Login no FlutterFlow, remover o parâmetro
   `Email` / `Param 1`. Manter apenas o nome do evento.
2. Avaliar um pedido de exclusão dos dados já coletados (recurso de exclusão de dados do Google
   Analytics / Firebase).

**Ressalva:** a análise mostra que o código faz isso. Não capturei tráfego para confirmar o envio em
tempo de execução.

## 2. Outros ajustes recomendados (baixo custo)

| # | Ajuste | Motivo | Como |
|---|---|---|---|
| 2 | Rever o registro automático de eventos do FlutterFlow | Cerca de 490 eventos de tela e toque, cada um com o UID do usuário, sem consentimento nem opção de recusa | Desligar o auto-logging nas configurações de Analytics do projeto, ou manter só `screen_view`. Considerar não enviar o UID |
| 3 | Desligar a coleta do ID de publicidade | O app não exibe anúncios, mas declara `AD_ID` e as permissões de AdServices (inseridas pelo SDK do Analytics) | No manifest: `google_analytics_adid_collection_enabled=false` e remover as permissões com `tools:node="remove"` |
| 4 | Consentimento para Analytics | Transparência (LGPD, art. 6º VI e art. 9º) | `setAnalyticsCollectionEnabled(false)` até o aceite, ou uma opção nas configurações |
| 5 | Restringir backup | `allowBackup` está no padrão (true), sem regras, então o cache do Firestore e a sessão podem ir para backups | `allowBackup="false"` ou `dataExtractionRules` |
| 6 | Embutir as fontes | Outfit e Roboto são baixadas de `fonts.gstatic.com` em tempo de execução, expondo o IP ao Google | Incluir as fontes como assets e usar `GoogleFonts.config.allowRuntimeFetching = false` |
| 7 | Remover plugins não usados | `sign_in_with_apple`, `device_info_plus`, `firebase_storage` (e `file_picker`, se não for usado) estão no app, mas não são chamados | Retirar do `pubspec.yaml` |
| 8 | Exclusão de conta no app | Não encontrei fluxo de exclusão de conta nem de exportação de dados no app (LGPD, art. 18) | Oferecer o fluxo no app, ou informar claramente o canal com o(a) DPO |

## 3. Pontos que não pude avaliar (lado do servidor)

Estes pontos concentram o risco real e dependem só da Mensa. **Não foram testados.**

- **Autorização na API** (`api.mensan.org.br`, 44 endpoints): o app trafega CPF, data de nascimento,
  endereço com coordenadas, telefones, e-mails e **CPF e contatos de representantes legais de
  associados menores**. Endpoints administrativos (eventos, avaliações de voluntariado, categorias)
  estão presentes no app de todos os associados, então a autorização precisa ser garantida no servidor.
- **Regras de segurança do Firestore** para a coleção `users`, que guarda tokens de certificado e
  do Google Wallet.
- **Três itens** que deixei para revisão manual da equipe: os métodos HTTP de cada chamada (inferidos
  dos nomes), como o link `app-api.mensa.org.br/certificado?MB=` é montado e aberto, e como as páginas
  validam parâmetros de rota recebidos pelo deep link `carteirinhasmensa://`.

## 4. Pontos positivos

- Permissões mínimas: câmera, armazenamento legado e notificações. Nada de localização, contatos,
  microfone, SMS ou lista de apps.
- Nenhum SDK de publicidade, atribuição, crash reporting ou da Meta. Só Google/Firebase.
- Nenhum provider exportado. Receivers e serviços exportados são protegidos por permissão.
- Tráfego somente por HTTPS. App Check ativo. Token do Firebase em todas as chamadas da API.
- Pouquíssimo dado local (número de associado e um timestamp).

## 5. Próximos passos propostos

- Peço a confirmação do recebimento e, se possível, uma previsão para a correção do item 1.
- Fico à disposição para detalhar qualquer ponto. Posso compartilhar as referências exatas (arquivo e
  linha no código descompilado) com a equipe técnica.
- Pretendo manter este material privado até a correção. Depois disso, gostaria de combinar com vocês
  uma eventual publicação da análise técnica.

---
*Análise técnica para fins de segurança e privacidade, sem caráter de aconselhamento jurídico.
Detalhes completos (em inglês): relatórios 01-09 do repositório da análise.*
