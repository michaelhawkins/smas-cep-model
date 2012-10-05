package de.hsaugsburg.cep.model

import scala.collection.immutable.List
import de.hsaugsburg.smas.communication.BaseMessage

sealed trait Event extends BaseMessage {
  val eventId: String
  val timestamp: Long
}

case class SensorEvent(eventId: String,
  timestamp: Long,
  state: Boolean,
  sensorId: String)
  extends Event

sealed trait ItemDataEvent
  extends Event {
  val itemId: String
}

case class ItemMovedEvent(eventId: String,
  timestamp: Long,
  itemId: String,
  sourceId: String,
  targetId: String)
  extends ItemDataEvent

case class WorkEvent(eventId: String,
  timestamp: Long,
  itemId: String,
  workerId: String)
  extends ItemDataEvent

case class ItemsChangedEvent(eventId: String,
  timestamp: Long,
  itemId: String,
  changeType: ChangeType.ChangeType)
  extends ItemDataEvent

sealed trait ProblemEvent
  extends Event {
  val severity: Severity
}

case class DeadlockEvent(eventId: String,
  timestamp: Long,
  severity: Severity,
  involvedItems: List[String])
  extends ProblemEvent