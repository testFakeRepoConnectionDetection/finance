package fixture;

import org.springframework.kafka.annotation.KafkaListener;

/**
 * Inbound cashflow from Accounting.
 *
 * <p>Edge fields: data cashflow, frequency monthly.
 */
public class IntegrationHints {

  /** data cashflow, frequency monthly — produced by Accounting */
  @KafkaListener(topics = "finance.cashflows", groupId = "finance-consolidation")
  public void onCashflow(String payload) {}
}
