package com.spriithy.serialization;

/**
 * Describes a Serializable object for the SDB
 * 
 * @author Theophile Dano
 *
 */
public interface Serializable {

	/**
	 * Sets the name of the Serializable object
	 * 
	 * @param name
	 *            The name to set
	 */
	public void setName(String name);

	/**
	 * Returns the name of the Serializable object
	 * 
	 * @return The name
	 */
	public String getName();

	/**
	 * Computes the size in bytes used by the Serializable object
	 * 
	 * @return The size in bytes
	 */
	public int getSize();

	/**
	 * Writes the data bytes of the Serializable object into the given byte array at the given position
	 * 
	 * @param dst
	 *            The destination array
	 * @param ptr
	 *            The pointer to where to start
	 * @return The pointer after having written all the data
	 */
	public int getBytes(byte[] dst, int ptr);

}
