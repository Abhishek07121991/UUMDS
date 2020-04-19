$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/UMDSapplication.feature");
formatter.feature({
  "name": "UMDS Login application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "user is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_is_on_login_page() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the hyperlink",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_the_hyperlink() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Authentication",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_click_on_the_Authentication() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_username_and_password() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_login_button() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_is_on_home_page() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user cam create Profile successfully.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters Business Profile ID",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_Business_Profile_ID() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Business Profile Name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_Business_Profile_Name() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Business Profile Description",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_Business_Profile_Description() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Aplication ID",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_Aplication_ID() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Actor ID",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_Actor_ID() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters FAS Role",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_FAS_Role() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clciks on Add button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.clciks_on_Add_button() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.clicks_on_submit_button() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "record is added",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.record_is_added() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinition.LoginStepDefinition.record_is_added(LoginStepDefinition.java:149)\r\n\tat ✽.record is added(src/test/java/feature/UMDSapplication.feature:22)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "user is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_is_on_login_page() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the hyperlink",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_the_hyperlink() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Authentication",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_click_on_the_Authentication() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_username_and_password() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_login_button() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_is_on_home_page() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify user can create an application successfully.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on Add applications",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_Add_applications() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Application ID",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_Application_ID() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Application name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_Application_name() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on add button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_add_button() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_submit_button() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "application is added",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.application_is_added() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinition.LoginStepDefinition.application_is_added(LoginStepDefinition.java:183)\r\n\tat ✽.application is added(src/test/java/feature/UMDSapplication.feature:31)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "user is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_is_on_login_page() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the hyperlink",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_the_hyperlink() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Authentication",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_click_on_the_Authentication() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_username_and_password() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_login_button() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_is_on_home_page() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify user can create an actor successfully.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on Add Actors",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_Add_Actors() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Actor ID",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_Actor_ID() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Actor name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_enters_Actor_name() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Add button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_Add_button() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Submit button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_clicks_on_Submit_button() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "actor is added",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.actor_is_added() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinition.LoginStepDefinition.actor_is_added(LoginStepDefinition.java:213)\r\n\tat ✽.actor is added(src/test/java/feature/UMDSapplication.feature:40)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user close the application",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.LoginStepDefinition.user_close_the_application() in file:/C:/Users/AbhishekKumar/Documents/workspace-spring-tool-suite-4-4.5.1.RELEASE/demo/target/test-classes/"
});
formatter.result({
  "status": "skipped"
});
});