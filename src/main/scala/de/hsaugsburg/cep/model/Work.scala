package de.hsaugsburg.cep.model

/**
 * Signifies the beginning or end of a work process of a machine.
 */
object Work extends Enumeration {
  type Work = Value
  val Begin, End = Value
}
