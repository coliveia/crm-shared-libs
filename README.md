# CRM Shared Libraries

Biblioteca compartilhada contendo DTOs, eventos, enums e utilitários comuns para todos os microsserviços do CRM Platform.

## Estrutura

```
src/main/java/com/vivo/crm/shared/
├── dto/              # Data Transfer Objects
│   ├── CaseDTO.java
│   ├── CaseEventDTO.java
│   ├── InteractionDTO.java
│   ├── RelationshipDTO.java
│   └── AttachmentDTO.java
├── event/            # Domain Events (Event Sourcing)
│   ├── DomainEvent.java
│   ├── CaseCreatedEvent.java
│   └── CaseStatusChangedEvent.java
├── enums/            # Enumerações
│   ├── CaseStatus.java
│   ├── CasePriority.java
│   └── InteractionType.java
├── exception/        # Exceções customizadas
│   ├── CRMException.java
│   └── CaseNotFoundException.java
└── util/             # Utilitários
    └── IdGenerator.java
```

## Uso

### Maven Dependency

```xml
<dependency>
    <groupId>com.vivo.crm</groupId>
    <artifactId>crm-shared-libs</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### Gradle Dependency

```gradle
implementation 'com.vivo.crm:crm-shared-libs:1.0.0-SNAPSHOT'
```

## Build

```bash
mvn clean install
```

## Versão

- **Java**: 21
- **Maven**: 3.9+
- **Lombok**: 1.18.30
- **Jackson**: 2.16.1

## Licença

Proprietary - Vivo/Telefônica Brasil
