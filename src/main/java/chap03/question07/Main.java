package chap03.question07;

/*
	https://www.acmicpc.net/problem/11022
	A+B -8
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
			for (int i = 0; i < size; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				int result = A + B;
				bw.write("Case #" + (i + 1) + ": " + A + " + " + B + " = " + result + "\n");
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
