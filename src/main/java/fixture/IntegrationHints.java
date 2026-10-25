package fixture;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Finance consolidation. Inbound P&L pack from PNL and ledger balances from Accounting.
 *
 * <p>data_category: PNL_PACK (API), LEDGER_BALANCE (Kafka).
 */
@RestController
@RequestMapping("/api/v1/pnl")
public class IntegrationHints {

  // POST /api/v1/pnl from PNL — data_category PNL_PACK

  /** data_category LEDGER_BALANCE — produced by Accounting */
  @KafkaListener(topics = "ledger.balances", groupId = "finance-consolidation")
  public void onLedgerBalance(String payload) {}
}
