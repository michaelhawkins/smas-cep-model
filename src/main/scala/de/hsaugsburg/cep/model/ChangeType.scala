package de.hsaugsburg.cep.model

object ChangeType extends Enumeration {
  type ChangeType = Value
  val Removed = Value("Removed")
  val Added = Value("Added")
}