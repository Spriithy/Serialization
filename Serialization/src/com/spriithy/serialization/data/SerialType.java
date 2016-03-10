/**
 * The MIT License (MIT)
 * Copyright (c) 2015 | Théophile Dano, Spriithy
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.spriithy.serialization.data;

/**
 * @author Théophile Dano, Spriithy 2015
 */
public class SerialType {

	public static final byte	UNKNOWN	= 0;
	public static final byte	BYTE	= 1;
	public static final byte	SHORT	= 2;
	public static final byte	CHAR	= 3;
	public static final byte	INTEGER	= 4;
	public static final byte	LONG	= 5;
	public static final byte	FLOAT	= 6;
	public static final byte	DOUBLE	= 7;
	public static final byte	BOOLEAN	= 8;
	public static final byte	STRING	= 9;
	
	public static int getSize(byte type) {
		switch (type) {
			case BYTE:		return 1;
			case SHORT:		return 2;
			case CHAR:		return 2;
			case INTEGER:	return 4;
			case LONG:		return 8;
			case FLOAT:		return 4;
			case DOUBLE:	return 8;
			case BOOLEAN:	return 1;
			case STRING:	return 1;
		}
		assert false;
		return 0;
	}
	
}
