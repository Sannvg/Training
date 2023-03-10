package com.training.seleniumpgms;

import java.util.Scanner;

public class VersionComparison {
	static String strlGV = "109.0.5414.75";

	public int compareVersion(String lversion, String version) {
		String[] arrlversion = lversion.split("\\.");
		String[] arrversion = version.split("\\.");
		int i = 0;

		while (i < arrversion.length || i < arrlversion.length) {
			if (i < arrversion.length && i < arrlversion.length) {
				if (Integer.parseInt(arrversion[i]) < Integer.parseInt(arrlversion[i])) {
					return -1;
				} else if (Integer.parseInt(arrversion[i]) > Integer.parseInt(arrlversion[i])) {
					return 1;
				}
			} else if (i < arrversion.length) {
				if (Integer.parseInt(arrversion[i]) != 0) {
					return 1;
				}
			} else if (i < arrlversion.length) {
				if (Integer.parseInt(arrlversion[i]) != 0) {
					return -1;
				}
			}
			i++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the version: ");
		String strV = sc.nextLine();
		VersionComparison vc = new VersionComparison();
		int rv = vc.compareVersion(strlGV, strV);
		if (rv == 1) {
			System.out.println("Entered Version is higher");
		} else if (rv == -1) {
			System.out.println("Entered Version is lower");
		} else {
			System.out.println("Entered Version is same");
		}
		sc.close();
	}
}
