package de.hsaugsburg.cep.model

/**
 * Signifies the beginning or end of a work process of a machine.
 *
 * User: Benny
 * Date: 07.10.12
 * Time: 20:07
 */
object Work extends Enumeration {
  type Work = Value
  val Begin = Value("Begin")
  val End = Value("End")
}
