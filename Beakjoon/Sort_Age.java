package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Sort_Age {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
		
        int A = Integer.parseInt(br.readLine());
        Person[] p = new Person[A];

		for(int i = 0; i < A; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[i] = new Person(age, name);
		}
 
		// 타입을 Person 으로 둘 것.
		Arrays.sort(p, new Comparator<Person>() {
			// 나이순으로 정렬
			@Override
			public int compare(Person s1, Person s2) {
				return s1.age - s2.age;
			}
			
		});
		
		for(int i = 0; i < A; i++) {
			// 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
			sb.append(p[i]);
		}
		System.out.println(sb);
    }
    
    public static class Person{
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
		public String toString() {
			return age + " " + name + "\n";
		}
    }
}

/* 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder[] p = new StringBuilder[201];
StringBuilder sb = new StringBuilder();
StringTokenizer st;

int A = Integer.parseInt(br.readLine());

for(int i = 0; i < p.length; i++){
    p[i] = new StringBuilder();
}
for(int i = 0; i < A; i++){
    st = new StringTokenizer(br.readLine(), " ");
    int age = Integer.parseInt(st.nextToken());
    String name = st.nextToken();
    p[age].append(age).append(" ").append(name).append('\n');
}
for(StringBuilder val: p){
    sb.append(val);
}
System.out.println(sb);
*/             