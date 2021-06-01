@Contact
Feature: Contact Page Validation

  @OptionalMandatory @Positive
  Scenario Outline: Contactpage positive scenario
  Given I am in Growthengg Homepage and click on ContactUs link
  When I enter firstname as "<firstname>"
  And I enter lastname as "<lastname>"
  And I enter email as "<email>"
  And I enter telephone as "<telephone>"
  And I enter companyname as "<companyname>"
  And I select country as "<country>"
  And I select number of learner as "<learners>"
  And I select the role as "<role>"
  And I select the purpose of "<enquiry>"
  And I click on terms and conditions
  When I click on submit button
  Then I should be able to submit the form
  
  Examples:
  | firstname | lastname | email            | telephone  | companyname | country | learners | role  | enquiry                                        |
  | harsh     | sharma   | abc123@gmail.com | 8107146179 | testcompany | India   | 501-1000   | Other | To find out how Growth Engineering can help me |
  @Mandatory @Positive
  Scenario Outline: Contactpage positive scenario 2
  Given I am in Growthengg Homepage and click on ContactUs link
  When I enter firstname as "<firstname>"
  And I enter lastname as "<lastname>"
  And I enter email as "<email>"
  And I enter telephone as "<telephone>"
  And I enter companyname as "<companyname>"
  And I select country as "<country>"
  And I select the role as "<role>"
  And I select the purpose of "<enquiry>"
  And I click on terms and conditions
  When I click on submit button
  Then I should be able to submit the form
  
  Examples:
  | firstname | lastname | email                     | telephone  | companyname | country | role  | enquiry                                        |
  | harsh     | sharma   | tU&2%3trYT=!$&I@gmail.com | 8107146179 | testcompany | India   | Other | To find out how Growth Engineering can help me |
  @EmptyFieldValidation @Negative
  Scenario: Contactpage Negative scenario 1
  Given I am in Growthengg Homepage and click on ContactUs link
  When I click on submit button
  Then I should not be able to submit the form and validate the error messages
  
  @TelephoneErrorValidation @Negative
  Scenario Outline: Validate Telephone text field
    Given I am in Growthengg Homepage and click on ContactUs link
    When I enter telephone as "<telephone>" 
    And I try to move to some other field
    Then I should be getting the telephone "<errormessage>"

    Examples: 
      | telephone                           | errormessage                                                |
      |                         -9234814085 | Must contain only numbers, +()-. and x.                     |
      |                         .9268350174 | Must contain only numbers, +()-. and x.                     |
      | 91+2312371313                       | Must contain only numbers, +()-. and x.                     |
      | 912312371313+                       | Must contain only numbers, +()-. and x.                     |
      | ()9268350174                        | Must contain only numbers, +()-. and x.                     |
      | 9268()350174                        | Must contain only numbers, +()-. and x.                     |
      | 9268350174()                        | Must contain only numbers, +()-. and x.                     |
      | 9268350174x                         | Must contain only numbers, +()-. and x.                     |
      |                               18124 | Please enter a phone number that's at least 7 numbers long. |
      | 12381321946234812039821938103219308 | Please enter a phone number that's at most 20 numbers long. |
      | ABDHFSDFJFFJNFBJ                    | Must contain only numbers, +()-. and x.                     |
  @EmailErrorValidation @Negative
  Scenario Outline: Con tactpage negative scenario
    Given I am in Growthengg Homepage and click on ContactUs link
    When I enter email as "<email>"
    And I try to move to some other field
    Then I should be getting the email "<errormessage>"

    Examples: 
      | email  | errormessage                       |
      | 123avc | Email must be formatted correctly. |
      | @h.com | Email must be formatted correctly. |
