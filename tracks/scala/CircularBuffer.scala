class EmptyBufferException() extends Exception {}

class FullBufferException() extends Exception {}

class CircularBuffer(var capacity: Int) {
  private var _list: List[Int] = List()

  def write(value: Int) = {
    if (_list.length == capacity) {
      throw new FullBufferException()
    }
    _list = _list :+ value
  }

  def read(): Int = {
    if (_list.isEmpty) {
      throw new EmptyBufferException()
    }
    val item = _list.head
    _list = _list.tail
    item
  }

  def overwrite(value: Int) = {
    if (_list.length == capacity) {
      read()
    }
    write(value)
  }

  def clear() = {
    _list = List()
  }
}