/**
 * The MIT License (MIT)
 * Copyright (c) 2015 | Th�ophile Dano, Spriithy
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
package com.spriithy.utils;

/**
 * @author Th�ophile Dano, Spriithy 2015
 */
public final class Validator {

	private Validator() {}

	public static void ifNull(String msg, Object ... objects) {
		for (Object object : objects)
			if (object == null || object.equals(null)) throw new NullPointerException(msg);
	}

	public static void ifTrue(boolean cond, String msg) {
		if (cond) throw new IllegalArgumentException(msg);
	}

	public static void ifFalse(boolean cond, String msg) {
		if (!cond) throw new IllegalArgumentException(msg);
	}

}
