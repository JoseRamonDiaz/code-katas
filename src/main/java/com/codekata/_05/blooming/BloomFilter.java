package com.codekata._05.blooming;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.List;

import com.codekata._04.datamunging.DataReader;

public class BloomFilter {
	int bitSetLength = 65536;
	BitSet bitSet = new BitSet(bitSetLength);
	List<String> words = null;
	//create an array and initialize with zeros
	public BloomFilter() {
		//initializeBitSet();
		printBitSet();
		words = getWords();
		storeHashesToArray();
	}
	
//	private void initializeBitSet() {
//		bitSet.set(0, 1023, false);
//	}
	
	//hash all our source data
	private List<String> getWords(){
		DataReader dataReader = new DataReader("wordlist.txt");
		List<String> words = dataReader.getLines();
		return words;
	}
	
	//store hashed values in our array
	private void storeHashesToArray() {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Generating hashes...");
		for(String word : words) {
			byte[] byteHash = md.digest(word.getBytes());
			
			for(int i = 0; i < 16; i+=2) {
				ByteBuffer bb = ByteBuffer.allocate(2);
				bb.order(ByteOrder.LITTLE_ENDIAN);
				bb.put(byteHash[i]);
				bb.put(byteHash[i + 1]);
				int s = bb.getShort(0) & 0xffff;
				bitSet.set(s, true);
			}
		}
		System.out.println("Hashes finished!");
		
	}
	
	public void printBitSet() {
		
		for(int i = 0; i < bitSetLength; i++) {
			if(bitSet.get(i)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		
		System.out.println();
	}
	
	//hash search input
	
	//verify bits in bit array
	
	//return if it probably exist or definitely not
	
}
