package de.hsaugsburg.cep.model

class Severity extends Enumeration {
  type Severity = Value
  val Warn = Value("Warn")
  val Error = Value("Error")
  val Fatal = Value("Fatal")
}