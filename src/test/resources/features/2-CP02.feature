@SC01 @RegistroAsistencia
Feature: CP02 - Validar registro de asistencia
  Background: Validar el registro de asistencia mediante el numero de DNI

    @CP0201
    Scenario: CP0201 - Registrar asistencia nueva
      Given el usuario ingresa contraseña valida
      When selecciona el turno
      And ingresa la asistencia por dni
      Then el aplicativo deberia mostrar la informacion del supervisor a capacitar

    @CP0201
    Scenario: CP0202 - Registrar asistencia existente
      Given el usuario ingresa contraseña valida
      When selecciona el turno
      And ingresa la asistencia por dni ya registrado
      Then el aplicativo deberia mostrar un mensaje de dni duplicado