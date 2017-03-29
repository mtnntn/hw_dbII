package simpledb.record;

/**
 * An identifier for a record within a file.
 * A RID consists of the block number in the file,
 * and the ID of the record in that block.
 * @author Edward Sciore
 */
public class RID {
	
	private int blknum;
	private int id;

	/**
	 * Creates a RID for the record having the
	 * specified ID in the specified block.
	 * @param blknum the block number where the record lives
	 * @param id the record's ID
	 */
	public RID(int blknum, int id) {
		this.blknum = blknum;
		this.id     = id;
	}
	
	public RID(){
		this.blknum = -909;
		this.id     = -909;
	}

	/**
	 * Returns the block number associated with this RID.
	 * @return the block number
	 */
	public int blockNumber() {
		return blknum;
	}

	/**
	 * Returns the ID associated with this RID.
	 * @return the ID
	 */
	public int id() {
		return id;
	}

	public boolean equals(Object obj) {
		RID r = (RID) obj;
		return blknum == r.blknum && id==r.id;
	}

	public String toString() {
		return "[blk_n:" + blknum + ", rec_id:" + id + "]";
	}
	
	@Override
	public int hashCode(){
		return this.blknum+this.id;
	}
}