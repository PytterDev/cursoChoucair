#Autor:
  @stories
  Feature: Academy Choucair
    As an user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
    @scenario1
    Scenario Outline: Search for a automation course
      Given than Petter wants to learn automation at the academy Choucair
      | strUser   | strPassword   |
      | <strUser> | <strPassword> |
      When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
      | strCourse   |
      | <strCourse> |
      Then he finds the course called resources Recursos Automatizacion Bancolombia
      | strCourse   |
      | <strCourse> |
      Examples:
        | strUser      | strPassword   | strCourse                           |
        | 1032424687   | Choucair2021* | Recursos Automatización Bancolombia |