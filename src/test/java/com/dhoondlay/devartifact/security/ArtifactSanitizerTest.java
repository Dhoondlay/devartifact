package com.dhoondlay.devartifact.security;

public class ArtifactSanitizerTest {
    public static void main(String[] args) {
        // Test: A string with an invisible Zero-Width Space in the middle
        String dirty = "Admin" + "\u200B" + "User";
        String clean = ArtifactSanitizer.stripHidden(dirty);

        System.out.println("Original Length: " + dirty.length()); // 10
        System.out.println("Cleaned Length: " + clean.length());   // 9

        if (clean.equals("AdminUser")) {
            System.out.println("✅ Test Passed: Invisible characters removed!");
        } else {
            System.out.println("❌ Test Failed.");
        }
    }
}