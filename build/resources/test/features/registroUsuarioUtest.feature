Feature: HU-001 Registro usuario Utest
  yo como usuario nuevo de Utest
  quiero registrarme en la pagina
  para ver poder ver el contenido de la pagina


  Scenario: Registro de usuario
    Given que me encuentro en la pagina de Utest con la url https://www.utest.com/
    When realizo el registro en la pagina
    Then podre ver el contenido de la pagina

