@SC01 @Report
Feature: CP03 - Validar reporte de asistencia
  Background: Validar el listado del reporte de asistencia

    @CP0301
    Scenario: CP0301 - Validar la lista de asistencia registrados por dni
      Given el usuario ingresa contraseña valida
      When selecciona el turno
      And ingresa la asistencia por dni
      When navega al modulo de reportes
      And selecciona el turno
      Then el aplicativo deberia mostrar el reporte de la asistencia por dni
