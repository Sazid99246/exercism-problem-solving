class EmptyBufferException extends Exception {}
class FullBufferException extends Exception {}

class CircularBuffer {
    private Byte capacity
    private Byte startingLocation
    private Byte size
    private Byte[] fixedByteArray

    CircularBuffer(int capacity) {
        this.capacity = capacity
        this.fixedByteArray = [0] * capacity
        this.size = 0;
        this.startingLocation = 0;
    }

    def clear() {
        this.size = 0;
    }

    def read() {
        if(this.size == 0) throw new EmptyBufferException()
        this.size -= 1
        this.startingLocation += 1
        this.startingLocation %= this.capacity
        this.fixedByteArray[startingLocation-1]
    }

    def write(int item) {
        if(this.size == this.capacity) throw new FullBufferException()
        this.overwrite(item)
    }

    def overwrite(int item) {
        if(this.size == this.capacity){
            this.size -= 1
            this.startingLocation += 1;
            this.startingLocation %= this.capacity
        }
        Byte writingPosition = (this.startingLocation + this.size) % this.capacity
        this.fixedByteArray[writingPosition] = item
        this.size += 1
    }
}