/*
 * MIT License
 * Copyright (c) 2017-2019 nuls.io
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
package network.nerve.pocnetwork.model;

import io.nuls.base.basic.AddressTool;
import io.nuls.core.model.ByteUtils;

/**
 * 自身节点公私钥
 */
public class ConsensusKeys {
    private byte[] privKey;
    private byte[] pubKey;
    private String address = null;

    public ConsensusKeys(byte[] publicKey, byte[] privateKey,int chainId) {
        this.pubKey = ByteUtils.copyOf(publicKey, publicKey.length);
        this.privKey = ByteUtils.copyOf(privateKey, privateKey.length);
        if (null==address){
            address= AddressTool.getStringAddressByBytes(AddressTool.getAddress(publicKey, chainId));
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getPrivKey() {
        return privKey;
    }

    public void setPrivKey(byte[] privKey) {
        this.privKey = privKey;
    }

    public byte[] getPubKey() {
        return pubKey;
    }

    public void setPubKey(byte[] pubKey) {
        this.pubKey = pubKey;
    }
}