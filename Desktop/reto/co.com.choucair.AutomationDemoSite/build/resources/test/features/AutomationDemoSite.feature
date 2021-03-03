# Juan Carlos Zarate
@register

Feature: Automation Demo Site
  As a user, I want to register on the Demo Site automation platform
  @scenario1
Scenario Outline: New user registration
  Given The user wants to register on the platform
  When register the fields requested by the platform
    |strFirsName|strLastName|strAddress          |strEmailAddress   |srtPhone  | strSkills    |strContry|srtYear|srtDay|strPassword|
    |Juan       |Carlos     | carrera 17a n 36 40|adioslave@live.com|3208581516|Implementation|Colombia |1985   |10     |Password1234|
  Then  register successfully
  |strValidate         |
  |Automation Demo Site|

Examples:
  |strFirsName|strLastName|strAddress          |strEmailAddress   |srtPhone  | strSkills    |strContry|srtYear|srtDay|strPassword|strValidate         |
  |Juan       |Carlos     | carrera 17a n 36 40|adioslave@live.com|3208581516|Implementation|Colombia |1985   |10     |Password1234|Automation Demo Site|