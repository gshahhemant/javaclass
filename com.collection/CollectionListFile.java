package com.collection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionListFile {

	public static void main(String[] args) throws IOException {

		List<String> lst = new ArrayList<String>();

		String fileName = "C:/hemant/river.txt";

		Stream<String> stream = Files.lines(Paths.get(fileName)); // Files library/api is java provided to read and writing files

		// Stream is library/api provided by java to stream any list/set or array
		
		lst = stream.collect(Collectors.toList());

		for (String p : lst) {
			System.out.println(p);
		}
		
		
	}

}
