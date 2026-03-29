package com.dhoondlay.devartifact.security;

import java.util.regex.Pattern;

/**
 * ArtifactSanitizer: A core utility for Dhoondlay/DevArtifact.
 * Focuses on removing "Invisible" threats and non-printable characters 
 * that bypass standard validation.
 */
public class ArtifactSanitizer {

    // Matches Zero-Width Spaces, Non-joiners, and other "Invisible" Unicode
    private static final Pattern INVISIBLE_CHARS = Pattern.compile("[\\u200B-\\u200D\\uFEFF]");

    // Matches Control Characters (non-printable)
    private static final Pattern CONTROL_CHARS = Pattern.compile("[\\p{Cntrl}]");

    /**
     * Strips hidden characters that can be used for "Homograph" attacks
     * or to bypass unique username constraints.
     */
    public static String stripHidden(String input) {
        if (input == null) return null;

        String clean = INVISIBLE_CHARS.matcher(input).replaceAll("");
        return CONTROL_CHARS.matcher(clean).replaceAll("");
    }

    /**
     * Strict sanitization: Trims, removes hidden chars, and ensures no 
     * leading/trailing whitespace.
     */
    public static String secureTrim(String input) {
        if (input == null) return null;
        return stripHidden(input).trim();
    }
}