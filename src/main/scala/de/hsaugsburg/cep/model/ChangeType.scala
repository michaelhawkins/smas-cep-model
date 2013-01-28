package de.hsaugsburg.cep.model

/**
 * Specifies the type of a ItemsChangedEvent. An item is either
 * Added or Removed.
 */
object ChangeType extends Enumeration {
  type ChangeType = Value
  val Removed, Added = Value
}