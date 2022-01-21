/*
 * Copyright (c) 2022 SIMBA Chain Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.simbachain.simba.platform;

import com.simbachain.simba.CallResponse;

/**
 * The return value of a call to a method using POST that contains return data.
 * The response contains a unique request identifier. This can either be
 * an ID generated for the request, or a transaction hash associated with the request
 * if the request is creating a trasnaction.
 * 
 * Additionally the response may contain a state attribute and an error string. 
 */
public class CallReturn<R> extends CallResponse {
    
    private final R returnValue;

    public CallReturn(String requestIdentitier, R returnValue) {
        super(requestIdentitier);
        this.returnValue = returnValue;
    }

    public R getReturnValue() {
        return returnValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallReturn{");
        sb.append("returnValue=")
          .append(returnValue);
        sb.append('}');
        return sb.toString();
    }
}
