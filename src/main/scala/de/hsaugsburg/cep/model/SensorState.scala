package de.hsaugsburg.cep.model

/**
 * Represents the state of a sensor.
 */
object SensorState extends Enumeration {
  type SensorState = Value
  val On, Off = Value
}
