# turnero-barberia

Sistema de reserva de turnos para barbería. Una vez reservado el turno, el cliente accede a un módulo
de recomendación de cortes basado en visagismo (análisis de forma de rostro a partir de fotos).

## Stack
- Java 17 · Spring Boot 4.1.1 · Maven
- Spring Web MVC, Data JPA, Validation, Security (JWT pendiente), Mail
- SQL Server (driver `mssql-jdbc`) · Flyway (preparado, desactivado por ahora)
- Lombok

## Cómo levantarlo
1. Tener SQL Server corriendo y crear una base vacía:
   ```sql
   CREATE DATABASE turnero_barberia;
   ```
2. Configurar credenciales (variables de entorno `DB_URL`, `DB_USER`, `DB_PASSWORD`,
   o editando `application.properties` localmente sin subir la contraseña real).
3. Levantar la app:
   ```powershell
   .\mvnw spring-boot:run
   ```

## Estructura de paquetes (`com.facu.turnero_barberia`)
| Paquete | Contenido |
|---|---|
| `entity` | Entidades JPA y enums (Rol, Estado, DiaSemana, FormaRostro) |
| `dto` | Request / Response DTOs |
| `repository` | Interfaces `JpaRepository` |
| `service` | Lógica de negocio |
| `controller` | Endpoints REST (`/api/...`) |
| `config` | Configuración (seguridad, etc.) |
| `exception` | Excepciones propias y `@RestControllerAdvice` |

## Flujo de ramas
`main` (estable) <- `desarrollo` <- `feature/*`
Cada feature se trabaja en su rama y se integra a `desarrollo` mediante Pull Request.
