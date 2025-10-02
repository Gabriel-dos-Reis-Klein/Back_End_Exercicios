## Serviço escolhido: Aplicativo de Música (Spotify-like)

### Casos de uso:

- Gerenciar playlists de um usuário (criar, listar, atualizar, deletar).
- Gerenciar músicas (buscar, adicionar, remover músicas de playlists).

### Recursos

- `playlists`
- `musicas`

### Endpoints

| Descrição | URI | Método HTTP | Corpo | Resposta Esperada | Erros esperados |
| --- | --- | --- | --- | --- | --- |
| Retornar todas as playlists de um usuário | `GET /usuarios/{usuario-id}/playlists` | `GET` | Vazio | `200 OK` | `404 Not Found` - usuário não encontrado. |
| Retornar uma playlist específica | `GET /usuarios/{usuario-id}/playlists/{playlist-id}` | `GET` | Vazio | `200 OK` | `404 Not Found` - usuário ou playlist não encontrados. |
| Criar nova playlist | `POST /usuarios/{usuario-id}/playlists` | `POST` | `{ "nome": "Rock Clássico" }` | `201 Created` | `404 Not Found` - usuário não encontrado. |
| Criar nova playlist | `POST /usuarios/{usuario-id}/playlists` | `POST` | `{ "nome": "Rock Clássico" }` | `201 Created` | `404 Not Found` - usuário não encontrado. |
| Criar nova playlist | `POST /usuarios/{usuario-id}/playlists` | `POST` | `{ "nome": "Rock Clássico" }` | `201 Created` | `404 Not Found` - usuário não encontrado. |
| Atualizar informações da playlist | `PUT /usuarios/{usuario-id}/playlists/{playlist-id}` | `PUT` | `{ "nome": "Rock Pesado" }` | `200 OK` | `404 Not Found` - usuário ou playlist não encontrados. |
| Deletar uma playlist | `DELETE /usuarios/{usuario-id}/playlists/{playlist-id}` | `DELETE` | Vazio | `200 OK` | `404 Not Found` - usuário ou playlist não encontrados. |
