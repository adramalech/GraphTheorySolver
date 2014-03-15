package graphAlgorithms;

import java.io.*;
import java.util.*;

public class Vertex {

	private String name;

	public Vertex() {
		name = null;
	}

	public Vertex(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}