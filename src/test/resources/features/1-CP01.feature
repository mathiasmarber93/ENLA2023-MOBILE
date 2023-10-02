@SC01 @Login
Feature: CP01 - Validar inicio de sesion
  Background: Validar el inicio de sesión con credenciales validas e invalidas

    @CP0101
    Scenario: CP0101 - Validar inicio de sesión con credenciales validas
      Given el usuario ingresa contraseña valida
      Then el aplicativo deberia mostrar la pantalla principal

    @CP0102
    Scenario: CP0102 - Validar inicio de sesión con credenciales inválidas
      Given el usuario ingresa contraseña invalida
      Then el aplicativo deberia mostrar un mensaje de error
