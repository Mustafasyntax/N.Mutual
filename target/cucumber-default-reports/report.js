$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint3"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I see OrangeHRM logo",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_see_OrangeHrm_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint3"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.i_enter_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_successfully_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});