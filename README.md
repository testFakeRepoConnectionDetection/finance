# Finance (fixture)

Business function: `MANAGEMENT_REPORTING` (`app.business_function`).
Pillar: `Finance` (`app.pillar`).

Management finance.

## Integrations (topology)

- Consumes Kafka topic `finance.cashflows` produced by **Accounting**.

## Data transiting on flows (Data Model fixture)

| Peer | direction | Kind | Channel | data | frequency |
|------|-----------|------|---------|------|-----------|
| Accounting | inbound | KAFKA | finance.cashflows | `cashflow` | `monthly` |

See `TransitDataTypes.java` and `application.yml` (`data`, `frequency`).
