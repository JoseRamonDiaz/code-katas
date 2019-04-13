package com.codekata._05.blooming;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.List;

import org.apache.commons.codec.binary.Hex;

import com.codekata._04.datamunging.DataReader;

public class BloomFilter {
	int bitSetLength = 2147483647;
	BitSet bitSet = new BitSet(bitSetLength);
	List<String> words = null;
	
	public BloomFilter() {
		//printBitSet();
		words = getWords();
		storeHashesToArray();
	}
	
	//hash all our source data
	private List<String> getWords(){
		DataReader dataReader = new DataReader("cwordlist.txt");
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
			
			for(int i = 0; i < 16; i+=4) {
				ByteBuffer bb = ByteBuffer.allocate(4);
				bb.order(ByteOrder.LITTLE_ENDIAN);
				bb.put(byteHash[i]);
				bb.put(byteHash[i + 1]);
				bb.put(byteHash[i + 2]);
				bb.put(byteHash[i + 3]);
				int s = bb.getInt(0);
				s = Math.abs(s);
				bitSet.set(s, true);
			}
		}
		System.out.println("Hashes finished!");
		
	}
	
	public void printBitSet() {
		
		int trueCounter = 0, falseCounter = 0;
		
		for(int i = 0; i < bitSetLength; i++) {
			
			if(bitSet.get(i)) {
				trueCounter++;
			}else {
				falseCounter++;
			}
		
		}
		System.out.println("trueCounter: " + trueCounter);
		System.out.println("falseCounter: " + falseCounter);

	}
	
	//search input
	public boolean search(String searchParam) {
		MessageDigest md = getDigestor();
		boolean exist = true;
		byte[] searchParamHash = md.digest(searchParam.getBytes());
	
		System.out.println(Hex.encodeHexString(searchParamHash));
		
		for(int i = 0; i < 16; i+=4) {
			ByteBuffer bb = ByteBuffer.allocate(4);
			bb.order(ByteOrder.LITTLE_ENDIAN);
			bb.put(searchParamHash[i]);
			bb.put(searchParamHash[i + 1]);
			bb.put(searchParamHash[i + 2]);
			bb.put(searchParamHash[i + 3]);
			int s = bb.getInt(0);
			s = Math.abs(s);
			if(!bitSet.get(s)) {
				return false;
			}
		}
		
		return exist;
	}
	
	private MessageDigest getDigestor() {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return md;
	}
	
	//hash search input
	
	
	//verify bits in bit array
	
	//return if it probably exist or definitely not
	
}
