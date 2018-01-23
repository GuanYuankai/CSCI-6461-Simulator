package increment.simulator;
/**
 * A cable adapter. It transfers signal from an existing cable, and puts signal to it.
 * @author Xu Ke
 *
 */
public class CableAdapter extends Cable {
	int width;
	int offset;
	Cable motherCable;
	public CableAdapter(int width, Cable cableInput, int offset) {
		this.width = width;
		this.offset = offset;
		this.motherCable = cableInput;
	}
	/**
	 * Returns width.
	 */
	@Override
	public int getWidth() {
		return width;
	}
	/**
	 * Returns the bit.
	 */
	@Override
	public boolean getBit(int bitPos) {
		return motherCable.getBit(bitPos + offset);
	}
	/**
	 * Sets the bit.
	 */
	@Override
	public void putBit(int bitPos, boolean val) {
		motherCable.putBit(bitPos + offset, val);
	}

}
