$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bankapp.feature");
formatter.feature({
  "line": 1,
  "name": "Withdraw from account",
  "description": "As a client of the bank\nI want to withdraw money from my account\nIn order to have cash",
  "id": "withdraw-from-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "An existing client withdraws from his account",
  "description": "",
  "id": "withdraw-from-account;an-existing-client-withdraws-from-his-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "an existing client named \"pierre-jean\" with 100.0 EUR in his account",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he withdraws 10.0 EUR from his account",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the new balance is 90.0 EUR",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});