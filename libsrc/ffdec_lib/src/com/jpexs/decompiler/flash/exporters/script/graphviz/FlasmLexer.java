/*
 *  Copyright (C) 2010-2024 JPEXS, All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */
package com.jpexs.decompiler.flash.exporters.script.graphviz;

/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0 from the specification file
 * <tt>C:/Dropbox/Programovani/JavaSE/FFDec/libsrc/ffdec_lib/lexers/actionscript_pcode_hilight.flex</tt>
 */
public final class FlasmLexer extends AbstractLexer {

    /**
     * This character denotes the end of file
     */
    public static final int YYEOF = -1;

    /**
     * initial size of the lookahead buffer
     */
    private static final int ZZ_BUFFERSIZE = 16384;

    /**
     * lexical states
     */
    public static final int YYINITIAL = 0;
    public static final int STRING = 2;
    public static final int PARAMETERS = 4;

    /**
     * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
     * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l at the
     * beginning of a line l is of the form l = 2*k, k a non negative integer
     */
    private static final int ZZ_LEXSTATE[] = {
        0, 0, 1, 1, 2, 2
    };

    /**
     * Translates characters to character classes
     */
    private static final String ZZ_CMAP_PACKED
            = "\11\6\1\4\1\2\1\42\1\43\1\1\16\6\4\0\1\4\1\0"
            + "\1\40\1\0\1\5\6\0\1\32\1\0\1\26\1\30\1\0\1\25"
            + "\3\41\4\33\2\27\1\7\1\3\5\0\4\5\1\31\25\5\1\0"
            + "\1\34\2\0\1\5\1\0\1\17\1\5\1\36\1\23\1\15\1\16"
            + "\1\35\1\5\1\24\2\5\1\20\1\5\1\22\1\37\2\5\1\13"
            + "\1\21\1\12\1\14\5\5\1\10\1\0\1\11\1\0\6\6\1\44"
            + "\32\6\2\0\4\5\4\0\1\5\2\0\1\6\7\0\1\5\4\0"
            + "\1\5\5\0\27\5\1\0\37\5\1\0\u01ca\5\4\0\14\5\16\0"
            + "\5\5\7\0\1\5\1\0\1\5\21\0\160\6\5\5\1\0\2\5"
            + "\2\0\4\5\1\0\1\5\6\0\1\5\1\0\3\5\1\0\1\5"
            + "\1\0\24\5\1\0\123\5\1\0\213\5\1\0\5\6\2\0\246\5"
            + "\1\0\46\5\2\0\1\5\6\0\51\5\6\0\1\5\1\0\55\6"
            + "\1\0\1\6\1\0\2\6\1\0\2\6\1\0\1\6\10\0\33\5"
            + "\4\0\4\5\15\0\6\6\5\0\1\5\4\0\13\6\1\0\1\6"
            + "\3\0\53\5\37\6\4\0\2\5\1\6\143\5\1\0\1\5\10\6"
            + "\1\0\6\6\2\5\2\6\1\0\4\6\2\5\12\6\3\5\2\0"
            + "\1\5\17\0\1\6\1\5\1\6\36\5\33\6\2\0\131\5\13\6"
            + "\1\5\16\0\12\6\41\5\11\6\2\5\4\0\1\5\2\0\1\6"
            + "\30\5\4\6\1\5\11\6\1\5\3\6\1\5\5\6\22\0\31\5"
            + "\3\6\4\0\13\5\65\0\25\5\1\0\22\5\13\0\61\6\66\5"
            + "\3\6\1\5\22\6\1\5\7\6\12\5\2\6\2\0\12\6\1\0"
            + "\20\5\3\6\1\0\10\5\2\0\2\5\2\0\26\5\1\0\7\5"
            + "\1\0\1\5\3\0\4\5\2\0\1\6\1\5\7\6\2\0\2\6"
            + "\2\0\3\6\1\5\10\0\1\6\4\0\2\5\1\0\3\5\2\6"
            + "\2\0\12\6\4\5\7\0\2\5\1\0\1\6\2\0\3\6\1\0"
            + "\6\5\4\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0"
            + "\2\5\1\0\2\5\2\0\1\6\1\0\5\6\4\0\2\6\2\0"
            + "\3\6\3\0\1\6\7\0\4\5\1\0\1\5\7\0\14\6\3\5"
            + "\1\6\13\0\3\6\1\0\11\5\1\0\3\5\1\0\26\5\1\0"
            + "\7\5\1\0\2\5\1\0\5\5\2\0\1\6\1\5\10\6\1\0"
            + "\3\6\1\0\3\6\2\0\1\5\17\0\2\5\2\6\2\0\12\6"
            + "\1\0\1\5\7\0\1\5\6\6\1\0\3\6\1\0\10\5\2\0"
            + "\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5\2\0"
            + "\1\6\1\5\7\6\2\0\2\6\2\0\3\6\7\0\3\6\4\0"
            + "\2\5\1\0\3\5\2\6\2\0\12\6\1\0\1\5\20\0\1\6"
            + "\1\5\1\0\6\5\3\0\3\5\1\0\4\5\3\0\2\5\1\0"
            + "\1\5\1\0\2\5\3\0\2\5\3\0\3\5\3\0\14\5\4\0"
            + "\5\6\3\0\3\6\1\0\4\6\2\0\1\5\6\0\1\6\16\0"
            + "\12\6\11\0\1\5\6\0\5\6\10\5\1\0\3\5\1\0\27\5"
            + "\1\0\20\5\3\0\1\5\7\6\1\0\3\6\1\0\4\6\7\0"
            + "\2\6\1\0\3\5\5\0\2\5\2\6\2\0\12\6\20\0\1\5"
            + "\3\6\1\0\10\5\1\0\3\5\1\0\27\5\1\0\12\5\1\0"
            + "\5\5\2\0\1\6\1\5\7\6\1\0\3\6\1\0\4\6\7\0"
            + "\2\6\7\0\1\5\1\0\2\5\2\6\2\0\12\6\1\0\2\5"
            + "\15\0\4\6\11\5\1\0\3\5\1\0\51\5\2\6\1\5\7\6"
            + "\1\0\3\6\1\0\4\6\1\5\5\0\3\5\1\6\7\0\3\5"
            + "\2\6\2\0\12\6\12\0\6\5\1\0\3\6\1\0\22\5\3\0"
            + "\30\5\1\0\11\5\1\0\1\5\2\0\7\5\3\0\1\6\4\0"
            + "\6\6\1\0\1\6\1\0\10\6\6\0\12\6\2\0\2\6\15\0"
            + "\60\5\1\6\2\5\7\6\4\0\10\5\10\6\1\0\12\6\47\0"
            + "\2\5\1\0\1\5\1\0\5\5\1\0\30\5\1\0\1\5\1\0"
            + "\12\5\1\6\2\5\11\6\1\5\2\0\5\5\1\0\1\5\1\0"
            + "\6\6\2\0\12\6\2\0\4\5\40\0\1\5\27\0\2\6\6\0"
            + "\12\6\13\0\1\6\1\0\1\6\1\0\1\6\4\0\2\6\10\5"
            + "\1\0\44\5\4\0\24\6\1\0\2\6\5\5\13\6\1\0\44\6"
            + "\11\0\1\6\71\0\53\5\24\6\1\5\12\6\6\0\6\5\4\6"
            + "\4\5\3\6\1\5\3\6\2\5\7\6\3\5\4\6\15\5\14\6"
            + "\1\5\17\6\2\0\46\5\1\0\1\5\5\0\1\5\2\0\53\5"
            + "\1\0\u014d\5\1\0\4\5\2\0\7\5\1\0\1\5\1\0\4\5"
            + "\2\0\51\5\1\0\4\5\2\0\41\5\1\0\4\5\2\0\7\5"
            + "\1\0\1\5\1\0\4\5\2\0\17\5\1\0\71\5\1\0\4\5"
            + "\2\0\103\5\2\0\3\6\40\0\20\5\20\0\126\5\2\0\6\5"
            + "\3\0\u026c\5\2\0\21\5\1\0\32\5\5\0\113\5\3\0\13\5"
            + "\7\0\15\5\1\0\4\5\3\6\13\0\22\5\3\6\13\0\22\5"
            + "\2\6\14\0\15\5\1\0\3\5\1\0\2\6\14\0\64\5\40\6"
            + "\3\0\1\5\3\0\2\5\1\6\2\0\12\6\41\0\4\6\1\0"
            + "\12\6\6\0\131\5\7\0\5\5\2\6\42\5\1\6\1\5\5\0"
            + "\106\5\12\0\37\5\1\0\14\6\4\0\14\6\12\0\12\6\36\5"
            + "\2\0\5\5\13\0\54\5\4\0\32\5\6\0\12\6\46\0\27\5"
            + "\5\6\4\0\65\5\12\6\1\0\35\6\2\0\13\6\6\0\12\6"
            + "\15\0\1\5\10\0\16\6\1\0\2\6\77\0\5\6\57\5\21\6"
            + "\7\5\4\0\12\6\21\0\11\6\14\0\3\6\36\5\15\6\2\5"
            + "\12\6\54\5\16\6\14\0\44\5\24\6\10\0\12\6\3\0\3\5"
            + "\12\6\44\5\2\0\11\5\7\0\53\5\2\0\3\5\20\0\3\6"
            + "\1\0\25\6\4\5\1\6\6\5\1\6\2\5\3\6\1\5\5\0"
            + "\300\5\72\6\1\0\5\6\u0116\5\2\0\6\5\2\0\46\5\2\0"
            + "\6\5\2\0\10\5\1\0\1\5\1\0\1\5\1\0\1\5\1\0"
            + "\37\5\2\0\65\5\1\0\7\5\1\0\1\5\3\0\3\5\1\0"
            + "\7\5\3\0\4\5\2\0\6\5\4\0\15\5\5\0\3\5\1\0"
            + "\7\5\16\0\5\6\30\0\1\42\1\42\5\6\20\0\2\5\23\0"
            + "\1\5\13\0\5\6\1\0\12\6\1\0\1\5\15\0\1\5\20\0"
            + "\15\5\3\0\40\5\20\0\15\6\4\0\1\6\3\0\14\6\21\0"
            + "\1\5\4\0\1\5\2\0\12\5\1\0\1\5\3\0\5\5\6\0"
            + "\1\5\1\0\1\5\1\0\1\5\1\0\4\5\1\0\13\5\2\0"
            + "\4\5\5\0\5\5\4\0\1\5\21\0\51\5\u0a77\0\57\5\1\0"
            + "\57\5\1\0\205\5\6\0\4\5\3\6\2\5\14\0\46\5\1\0"
            + "\1\5\5\0\1\5\2\0\70\5\7\0\1\5\17\0\1\6\27\5"
            + "\11\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5"
            + "\1\0\7\5\1\0\7\5\1\0\7\5\1\0\40\6\57\0\1\5"
            + "\u01d5\0\3\5\31\0\11\5\6\6\1\0\5\5\2\0\5\5\4\0"
            + "\126\5\2\0\2\6\2\0\3\5\1\0\132\5\1\0\4\5\5\0"
            + "\53\5\1\0\136\5\21\0\40\5\60\0\20\5\u0200\0\u19c0\5\100\0"
            + "\u51fd\5\3\0\u048d\5\103\0\56\5\2\0\u010d\5\3\0\20\5\12\6"
            + "\2\5\24\0\57\5\1\6\4\0\12\6\1\0\37\5\2\6\120\5"
            + "\2\6\45\0\11\5\2\0\147\5\2\0\65\5\2\0\11\5\52\0"
            + "\15\5\1\6\3\5\1\6\4\5\1\6\27\5\5\6\4\0\1\6"
            + "\13\0\1\5\7\0\64\5\14\0\2\6\62\5\22\6\12\0\12\6"
            + "\6\0\22\6\6\5\3\0\1\5\1\0\2\5\13\6\34\5\10\6"
            + "\2\0\27\5\15\6\14\0\35\5\3\0\4\6\57\5\16\6\16\0"
            + "\1\5\12\6\6\0\5\5\1\6\12\5\12\6\5\5\1\0\51\5"
            + "\16\6\11\0\3\5\1\6\10\5\2\6\2\0\12\6\6\0\27\5"
            + "\3\0\1\5\3\6\62\5\1\6\1\5\3\6\2\5\2\6\5\5"
            + "\2\6\1\5\1\6\1\5\30\0\3\5\2\0\13\5\5\6\2\0"
            + "\3\5\2\6\12\0\6\5\2\0\6\5\2\0\6\5\11\0\7\5"
            + "\1\0\7\5\1\0\53\5\1\0\16\5\6\0\163\5\10\6\1\0"
            + "\2\6\2\0\12\6\6\0\u2ba4\5\14\0\27\5\4\0\61\5\u2104\0"
            + "\u016e\5\2\0\152\5\46\0\7\5\14\0\5\5\5\0\1\5\1\6"
            + "\12\5\1\0\15\5\1\0\5\5\1\0\1\5\1\0\2\5\1\0"
            + "\2\5\1\0\154\5\41\0\u016b\5\22\0\100\5\2\0\66\5\50\0"
            + "\15\5\3\0\20\6\20\0\20\6\3\0\2\5\30\0\3\5\31\0"
            + "\1\5\6\0\5\5\1\0\207\5\2\0\1\6\4\0\1\5\13\0"
            + "\12\6\7\0\32\5\4\0\1\5\1\0\32\5\13\0\131\5\3\0"
            + "\6\5\2\0\6\5\2\0\6\5\2\0\3\5\3\0\2\5\3\0"
            + "\2\5\22\0\3\6\4\0\14\5\1\0\32\5\1\0\23\5\1\0"
            + "\2\5\1\0\17\5\2\0\16\5\42\0\173\5\105\0\65\5\210\0"
            + "\1\6\202\0\35\5\3\0\61\5\17\0\1\6\37\0\40\5\15\0"
            + "\36\5\5\0\46\5\5\6\5\0\36\5\2\0\44\5\4\0\10\5"
            + "\1\0\5\5\52\0\236\5\2\0\12\6\6\0\44\5\4\0\44\5"
            + "\4\0\50\5\10\0\64\5\234\0\u0137\5\11\0\26\5\12\0\10\5"
            + "\230\0\6\5\2\0\1\5\1\0\54\5\1\0\2\5\3\0\1\5"
            + "\2\0\27\5\12\0\27\5\11\0\37\5\101\0\23\5\1\0\2\5"
            + "\12\0\26\5\12\0\32\5\106\0\70\5\6\0\2\5\100\0\1\5"
            + "\3\6\1\0\2\6\5\0\4\6\4\5\1\0\3\5\1\0\35\5"
            + "\2\0\3\6\4\0\1\6\40\0\35\5\3\0\35\5\43\0\10\5"
            + "\1\0\34\5\2\6\31\0\66\5\12\0\26\5\12\0\23\5\15\0"
            + "\22\5\156\0\111\5\67\0\63\5\15\0\63\5\15\0\44\5\4\6"
            + "\10\0\12\6\u0146\0\52\5\1\0\2\6\3\0\2\5\116\0\35\5"
            + "\12\0\1\5\10\0\26\5\13\6\137\0\25\5\33\0\27\5\11\0"
            + "\3\6\65\5\17\6\37\0\12\6\17\0\4\6\55\5\13\6\2\0"
            + "\1\6\17\0\1\6\2\0\31\5\7\0\12\6\6\0\3\6\44\5"
            + "\16\6\1\0\12\6\4\0\1\5\2\6\1\5\10\0\43\5\1\6"
            + "\2\0\1\5\11\0\3\6\60\5\16\6\4\5\4\0\4\6\1\0"
            + "\14\6\1\5\1\0\1\5\43\0\22\5\1\0\31\5\14\6\6\0"
            + "\1\6\101\0\7\5\1\0\1\5\1\0\4\5\1\0\17\5\1\0"
            + "\12\5\7\0\57\5\14\6\5\0\12\6\6\0\4\6\1\0\10\5"
            + "\2\0\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5"
            + "\1\0\2\6\1\5\7\6\2\0\2\6\2\0\3\6\2\0\1\5"
            + "\6\0\1\6\5\0\5\5\2\6\2\0\7\6\3\0\5\6\213\0"
            + "\65\5\22\6\4\5\5\0\12\6\4\0\1\6\3\5\36\0\60\5"
            + "\24\6\2\5\1\0\1\5\10\0\12\6\246\0\57\5\7\6\2\0"
            + "\11\6\27\0\4\5\2\6\42\0\60\5\21\6\3\0\1\5\13\0"
            + "\12\6\46\0\53\5\15\6\1\5\7\0\12\6\66\0\33\5\2\0"
            + "\17\6\4\0\12\6\306\0\54\5\17\6\145\0\100\5\12\6\25\0"
            + "\10\5\2\0\1\5\2\0\10\5\1\0\2\5\1\0\30\5\6\6"
            + "\1\0\2\6\2\0\4\6\1\5\1\6\1\5\2\6\14\0\12\6"
            + "\106\0\10\5\2\0\47\5\7\6\2\0\7\6\1\5\1\0\1\5"
            + "\1\6\33\0\1\5\12\6\50\5\7\6\1\5\4\6\10\0\1\6"
            + "\10\0\1\5\13\6\56\5\20\6\3\0\1\5\42\0\71\5\u0107\0"
            + "\11\5\1\0\45\5\10\6\1\0\10\6\1\5\17\0\12\6\30\0"
            + "\36\5\2\0\26\6\1\0\16\6\111\0\7\5\1\0\2\5\1\0"
            + "\46\5\6\6\3\0\1\6\1\0\2\6\1\0\7\6\1\5\1\6"
            + "\10\0\12\6\6\0\6\5\1\0\2\5\1\0\40\5\5\6\1\0"
            + "\2\6\1\0\5\6\1\5\7\0\12\6\u0136\0\23\5\4\6\271\0"
            + "\1\5\54\0\4\5\37\0\u039a\5\146\0\157\5\21\0\304\5\u0abc\0"
            + "\u042f\5\1\0\11\6\u0fc7\0\u0247\5\u21b9\0\u0239\5\7\0\37\5\1\0"
            + "\12\6\146\0\36\5\2\0\5\6\13\0\60\5\7\6\11\0\4\5"
            + "\14\0\12\6\11\0\25\5\5\0\23\5\u02b0\0\100\5\200\0\113\5"
            + "\4\0\1\6\1\5\67\6\7\0\4\6\15\5\100\0\2\5\1\0"
            + "\1\5\1\6\13\0\2\6\16\0\u17f8\5\10\0\u04d6\5\52\0\11\5"
            + "\u22f7\0\u011f\5\61\0\3\5\21\0\4\5\10\0\u018c\5\u0904\0\153\5"
            + "\5\0\15\5\3\0\11\5\7\0\12\5\3\0\2\6\1\0\4\6"
            + "\u14c1\0\5\6\3\0\26\6\2\0\7\6\36\0\4\6\224\0\3\6"
            + "\u01bb\0\125\5\1\0\107\5\1\0\2\5\2\0\1\5\2\0\2\5"
            + "\2\0\4\5\1\0\14\5\1\0\1\5\1\0\7\5\1\0\101\5"
            + "\1\0\4\5\2\0\10\5\1\0\7\5\1\0\34\5\1\0\4\5"
            + "\1\0\5\5\1\0\1\5\3\0\7\5\1\0\u0154\5\2\0\31\5"
            + "\1\0\31\5\1\0\37\5\1\0\31\5\1\0\37\5\1\0\31\5"
            + "\1\0\37\5\1\0\31\5\1\0\37\5\1\0\31\5\1\0\10\5"
            + "\2\0\62\6\u0200\0\67\6\4\0\62\6\10\0\1\6\16\0\1\6"
            + "\26\0\5\6\1\0\17\6\u0550\0\7\6\1\0\21\6\2\0\7\6"
            + "\1\0\2\6\1\0\5\6\325\0\55\5\3\0\7\6\7\5\2\0"
            + "\12\6\4\0\1\5\u0171\0\54\5\16\6\5\0\1\5\u0500\0\305\5"
            + "\13\0\7\6\51\0\104\5\7\6\1\5\4\0\12\6\u0356\0\1\5"
            + "\u014f\0\4\5\1\0\33\5\1\0\2\5\1\0\1\5\2\0\1\5"
            + "\1\0\12\5\1\0\4\5\1\0\1\5\1\0\1\5\6\0\1\5"
            + "\4\0\1\5\1\0\1\5\1\0\1\5\1\0\3\5\1\0\2\5"
            + "\1\0\1\5\2\0\1\5\1\0\1\5\1\0\1\5\1\0\1\5"
            + "\1\0\1\5\1\0\2\5\1\0\1\5\2\0\4\5\1\0\7\5"
            + "\1\0\4\5\1\0\4\5\1\0\1\5\1\0\12\5\1\0\21\5"
            + "\5\0\3\5\1\0\5\5\1\0\21\5\u0d34\0\12\6\u0406\0\ua6de\5"
            + "\42\0\u1035\5\13\0\336\5\2\0\u1682\5\16\0\u1d31\5\u0c1f\0\u021e\5"
            + "\u05e2\0\u134b\5\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uecc0\0"
            + "\1\6\36\0\140\6\200\0\360\6\uffff\0\uffff\0\ufe12\0";

    /**
     * Translates characters to character classes
     */
    private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

    /**
     * Translates DFA states to action switch labels.
     */
    private static final int[] ZZ_ACTION = zzUnpackAction();

    private static final String ZZ_ACTION_PACKED_0
            = "\3\0\1\1\2\2\1\3\1\4\1\5\1\4\1\6"
            + "\2\7\1\1\1\10\2\11\6\12\1\13\2\1\1\12"
            + "\1\14\1\15\1\16\2\6\5\12\1\0\1\13\1\0"
            + "\1\12\1\6\5\12\1\13\1\0\1\12\1\17\16\12"
            + "\1\20\1\0\2\20";

    private static int[] zzUnpackAction() {
        int[] result = new int[69];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int[] result) {
        int i = 0;
        /* index in packed string  */
        int j = offset;
        /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do {
                result[j++] = value;
            } while (--count > 0);
        }
        return j;
    }

    /**
     * Translates a state to a row index in the transition table
     */
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

    private static final String ZZ_ROWMAP_PACKED_0
            = "\0\0\0\45\0\112\0\157\0\224\0\157\0\271\0\336"
            + "\0\u0103\0\157\0\u0128\0\u014d\0\157\0\u0172\0\157\0\u0197"
            + "\0\157\0\u01bc\0\u01e1\0\u0206\0\u022b\0\u0250\0\u0275\0\u029a"
            + "\0\u02bf\0\u02e4\0\u0309\0\157\0\157\0\157\0\u032e\0\u0353"
            + "\0\u0378\0\u039d\0\u03c2\0\u03e7\0\u040c\0\u0431\0\u0456\0\u02e4"
            + "\0\u047b\0\157\0\u04a0\0\u04c5\0\u04ea\0\u050f\0\u0534\0\u0559"
            + "\0\u0559\0\u057e\0\u01bc\0\u05a3\0\u05c8\0\u05ed\0\u0612\0\u0637"
            + "\0\u065c\0\u0681\0\u06a6\0\u06cb\0\u06f0\0\u0715\0\u073a\0\u075f"
            + "\0\u0784\0\u01bc\0\u07a9\0\u07ce\0\u07f3";

    private static int[] zzUnpackRowMap() {
        int[] result = new int[69];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int[] result) {
        int i = 0;
        /* index in packed string  */
        int j = offset;
        /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    /**
     * The transition table of the DFA
     */
    private static final int[] ZZ_TRANS = zzUnpackTrans();

    private static final String ZZ_TRANS_PACKED_0
            = "\1\4\1\5\1\6\1\7\1\10\1\11\3\4\1\12"
            + "\13\11\4\4\1\11\3\4\3\11\3\4\1\10\1\4"
            + "\1\13\1\14\1\15\31\13\1\16\3\13\1\17\4\13"
            + "\1\4\1\20\1\21\1\7\1\10\1\22\2\4\1\12"
            + "\1\4\1\23\1\24\1\25\1\22\1\26\3\22\1\27"
            + "\2\22\1\30\1\31\1\30\1\32\1\22\1\4\1\30"
            + "\1\4\1\22\1\33\1\22\1\34\1\30\1\4\1\10"
            + "\1\4\47\0\1\6\42\0\1\7\2\0\42\7\4\0"
            + "\1\10\36\0\1\10\6\0\2\11\1\35\2\0\14\11"
            + "\1\0\1\11\1\0\1\11\1\0\1\11\1\0\3\11"
            + "\1\0\1\11\2\0\1\11\1\13\2\0\31\13\1\0"
            + "\3\13\1\0\4\13\2\0\1\15\42\0\1\36\2\0"
            + "\22\36\1\37\5\36\1\40\5\36\1\37\5\0\1\21"
            + "\47\0\2\22\3\0\14\22\1\0\1\22\1\0\1\22"
            + "\1\0\1\22\1\0\3\22\1\0\1\22\2\0\1\22"
            + "\5\0\2\22\3\0\1\22\1\41\12\22\1\0\1\22"
            + "\1\0\1\22\1\0\1\22\1\0\3\22\1\0\1\22"
            + "\2\0\1\22\5\0\2\22\3\0\3\22\1\42\10\22"
            + "\1\0\1\22\1\0\1\22\1\0\1\22\1\0\3\22"
            + "\1\0\1\22\2\0\1\22\5\0\2\22\3\0\10\22"
            + "\1\43\3\22\1\0\1\22\1\0\1\22\1\0\1\22"
            + "\1\0\3\22\1\0\1\22\2\0\1\22\5\0\2\22"
            + "\3\0\5\22\1\44\6\22\1\0\1\22\1\0\1\22"
            + "\1\0\1\22\1\0\3\22\1\0\1\22\2\0\1\22"
            + "\5\0\2\22\3\0\2\22\1\45\11\22\1\0\1\22"
            + "\1\0\1\22\1\0\1\22\1\0\3\22\1\0\1\22"
            + "\2\0\1\22\15\0\1\46\7\0\1\30\1\0\1\30"
            + "\1\47\1\46\1\0\1\30\5\0\1\30\30\0\1\30"
            + "\1\0\1\30\1\50\2\0\1\30\5\0\1\30\30\0"
            + "\1\47\1\0\1\47\3\0\1\47\5\0\1\47\10\0"
            + "\2\22\3\0\14\22\1\0\1\22\1\0\1\22\1\0"
            + "\1\22\1\0\2\22\1\51\1\0\1\22\2\0\1\22"
            + "\25\0\1\40\5\0\1\40\5\0\1\40\30\0\1\52"
            + "\5\0\1\52\5\0\1\52\10\0\2\22\3\0\2\22"
            + "\1\53\11\22\1\0\1\22\1\0\1\22\1\0\1\22"
            + "\1\0\3\22\1\0\1\22\2\0\1\22\5\0\2\22"
            + "\3\0\14\22\1\0\1\22\1\0\1\22\1\0\1\22"
            + "\1\0\1\54\2\22\1\0\1\22\2\0\1\22\5\0"
            + "\2\22\3\0\11\22\1\55\2\22\1\0\1\22\1\0"
            + "\1\22\1\0\1\22\1\0\3\22\1\0\1\22\2\0"
            + "\1\22\5\0\2\22\3\0\6\22\1\56\5\22\1\0"
            + "\1\22\1\0\1\22\1\0\1\22\1\0\3\22\1\0"
            + "\1\22\2\0\1\22\5\0\2\22\3\0\6\22\1\57"
            + "\5\22\1\0\1\22\1\0\1\22\1\0\1\22\1\0"
            + "\3\22\1\0\1\22\2\0\1\22\25\0\1\60\1\61"
            + "\1\60\2\0\1\61\1\60\5\0\1\60\20\0\1\46"
            + "\7\0\1\47\1\0\1\47\1\0\1\46\1\0\1\47"
            + "\5\0\1\47\10\0\2\22\3\0\10\22\1\62\3\22"
            + "\1\0\1\22\1\0\1\22\1\0\1\22\1\0\3\22"
            + "\1\0\1\22\2\0\1\22\5\0\2\22\3\0\3\22"
            + "\1\63\10\22\1\0\1\22\1\0\1\22\1\0\1\22"
            + "\1\0\3\22\1\0\1\22\2\0\1\22\5\0\2\22"
            + "\3\0\12\22\1\64\1\22\1\0\1\22\1\0\1\22"
            + "\1\0\1\22\1\0\3\22\1\0\1\22\2\0\1\22"
            + "\5\0\2\22\3\0\3\22\1\65\10\22\1\0\1\22"
            + "\1\0\1\22\1\0\1\22\1\0\3\22\1\0\1\22"
            + "\2\0\1\22\5\0\2\22\3\0\7\22\1\53\4\22"
            + "\1\0\1\22\1\0\1\22\1\0\1\22\1\0\3\22"
            + "\1\0\1\22\2\0\1\22\5\0\2\22\3\0\6\22"
            + "\1\63\5\22\1\0\1\22\1\0\1\22\1\0\1\22"
            + "\1\0\3\22\1\0\1\22\2\0\1\22\25\0\1\60"
            + "\1\0\1\60\3\0\1\60\5\0\1\60\10\0\2\22"
            + "\3\0\7\22\1\66\4\22\1\0\1\22\1\0\1\22"
            + "\1\0\1\22\1\0\3\22\1\0\1\22\2\0\1\22"
            + "\5\0\2\22\3\0\7\22\1\67\4\22\1\0\1\22"
            + "\1\0\1\22\1\0\1\22\1\0\3\22\1\0\1\22"
            + "\2\0\1\22\5\0\2\22\3\0\4\22\1\70\7\22"
            + "\1\0\1\22\1\0\1\22\1\0\1\22\1\0\3\22"
            + "\1\0\1\22\2\0\1\22\5\0\2\22\3\0\1\71"
            + "\13\22\1\0\1\22\1\0\1\22\1\0\1\22\1\0"
            + "\3\22\1\0\1\22\2\0\1\22\5\0\2\22\3\0"
            + "\1\72\13\22\1\0\1\22\1\0\1\22\1\0\1\22"
            + "\1\0\3\22\1\0\1\22\2\0\1\22\5\0\2\22"
            + "\3\0\12\22\1\73\1\22\1\0\1\22\1\0\1\22"
            + "\1\0\1\22\1\0\3\22\1\0\1\22\2\0\1\22"
            + "\5\0\2\22\3\0\5\22\1\74\6\22\1\0\1\22"
            + "\1\0\1\22\1\0\1\22\1\0\3\22\1\0\1\22"
            + "\2\0\1\22\5\0\2\22\3\0\3\22\1\75\10\22"
            + "\1\0\1\22\1\0\1\22\1\0\1\22\1\0\3\22"
            + "\1\0\1\22\2\0\1\22\5\0\2\22\3\0\10\22"
            + "\1\76\3\22\1\0\1\22\1\0\1\22\1\0\1\22"
            + "\1\0\3\22\1\0\1\22\2\0\1\22\5\0\2\22"
            + "\3\0\10\22\1\77\3\22\1\0\1\22\1\0\1\22"
            + "\1\0\1\22\1\0\3\22\1\0\1\22\2\0\1\22"
            + "\5\0\2\22\3\0\1\22\1\100\12\22\1\0\1\22"
            + "\1\0\1\22\1\0\1\22\1\0\3\22\1\0\1\22"
            + "\2\0\1\22\5\0\2\22\3\0\3\22\1\101\10\22"
            + "\1\0\1\22\1\0\1\22\1\0\1\22\1\0\3\22"
            + "\1\0\1\22\2\0\1\22\5\0\2\22\3\0\1\100"
            + "\13\22\1\0\1\22\1\0\1\22\1\0\1\22\1\0"
            + "\3\22\1\0\1\22\2\0\1\22\5\0\2\22\3\0"
            + "\13\22\1\102\1\103\1\104\1\0\1\22\1\0\1\104"
            + "\1\0\3\22\1\0\1\104\2\0\1\22\5\0\2\22"
            + "\3\0\11\22\1\63\2\22\1\0\1\22\1\0\1\22"
            + "\1\0\1\22\1\0\3\22\1\0\1\22\2\0\1\22"
            + "\27\0\1\105\3\0\1\105\5\0\1\105\10\0\2\22"
            + "\3\0\13\22\1\104\1\0\1\104\1\0\1\22\1\0"
            + "\1\104\1\0\3\22\1\0\1\104\2\0\1\22\25\0"
            + "\1\105\1\0\1\105\3\0\1\105\5\0\1\105\3\0";

    private static int[] zzUnpackTrans() {
        int[] result = new int[2072];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int[] result) {
        int i = 0;
        /* index in packed string  */
        int j = offset;
        /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            value--;
            do {
                result[j++] = value;
            } while (--count > 0);
        }
        return j;
    }


    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;

    /* error messages for the codes above */
    private static final String ZZ_ERROR_MSG[] = {
        "Unknown internal scanner error",
        "Error: could not match input",
        "Error: pushback value was too large"
    };

    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
     */
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

    private static final String ZZ_ATTRIBUTE_PACKED_0
            = "\3\0\1\11\1\1\1\11\3\1\1\11\2\1\1\11"
            + "\1\1\1\11\1\1\1\11\12\1\3\11\7\1\1\0"
            + "\1\1\1\0\1\1\1\11\6\1\1\0\21\1\1\0"
            + "\2\1";

    private static int[] zzUnpackAttribute() {
        int[] result = new int[69];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int[] result) {
        int i = 0;
        /* index in packed string  */
        int j = offset;
        /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int count = packed.charAt(i++);
            int value = packed.charAt(i++);
            do {
                result[j++] = value;
            } while (--count > 0);
        }
        return j;
    }

    /**
     * the input device
     */
    private java.io.Reader zzReader;

    /**
     * the current state of the DFA
     */
    private int zzState;

    /**
     * the current lexical state
     */
    private int zzLexicalState = YYINITIAL;

    /**
     * this buffer contains the current text to be matched and is the source of
     * the yytext() string
     */
    private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

    /**
     * the textposition at the last accepting state
     */
    private int zzMarkedPos;

    /**
     * the current text position in the buffer
     */
    private int zzCurrentPos;

    /**
     * startRead marks the beginning of the yytext() string in the buffer
     */
    private int zzStartRead;

    /**
     * endRead marks the last character in the buffer, that has been read from
     * input
     */
    private int zzEndRead;

    /**
     * number of newlines encountered up to the start of the matched text
     */
    private int yyline;

    /**
     * the number of characters up to the start of the matched text
     */
    private int yychar;

    /**
     * the number of characters from the last newline up to the start of the
     * matched text
     */
    private int yycolumn;

    /**
     * zzAtBOL == true <=> the scanner is currently at the beginning of a line
     */
    private boolean zzAtBOL = true;

    /**
     * zzAtEOF == true <=> the scanner is at the EOF
     */
    private boolean zzAtEOF;

    /**
     * denotes if the user-EOF-code has already been executed
     */
    private boolean zzEOFDone;

    /**
     * The number of occupied positions in zzBuffer beyond zzEndRead. When a
     * lead/high surrogate has been read from the input stream into the final
     * zzBuffer position, this will have a value of 1; otherwise, it will have a
     * value of 0.
     */
    private int zzFinalHighSurrogate = 0;

    /* user code: */
    StringBuilder string = new StringBuilder();

    /**
     * Create an empty lexer, yyrset will be called later to reset and assign
     * the reader
     */
    public FlasmLexer() {

    }

    public int yychar() {
        return yychar;
    }

    /**
     * Creates a new scanner
     *
     * @param in the java.io.Reader to read input from.
     */
    public FlasmLexer(java.io.Reader in) {
        this.zzReader = in;
    }

    /**
     * Unpacks the compressed character translation table.
     *
     * @param packed the packed character translation table
     * @return the unpacked character translation table
     */
    private static char[] zzUnpackCMap(String packed) {
        char[] map = new char[0x110000];
        int i = 0;
        /* index in packed string  */
        int j = 0;
        /* index in unpacked array */
        while (i < 3662) {
            int count = packed.charAt(i++);
            char value = packed.charAt(i++);
            do {
                map[j++] = value;
            } while (--count > 0);
        }
        return map;
    }

    /**
     * Refills the input buffer.
     *
     * @return <code>false</code>, iff there was new input.
     * @throws java.io.IOException if any I/O-Error occurs
     */
    private boolean zzRefill() throws java.io.IOException {

        /* first: make room (if you can) */
        if (zzStartRead > 0) {
            zzEndRead += zzFinalHighSurrogate;
            zzFinalHighSurrogate = 0;
            System.arraycopy(zzBuffer, zzStartRead,
                    zzBuffer, 0,
                    zzEndRead - zzStartRead);

            /* translate stored positions */
            zzEndRead -= zzStartRead;
            zzCurrentPos -= zzStartRead;
            zzMarkedPos -= zzStartRead;
            zzStartRead = 0;
        }

        /* is the buffer big enough? */
        if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
            /* if not: blow it up */
            char newBuffer[] = new char[zzBuffer.length * 2];
            System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
            zzBuffer = newBuffer;
            zzEndRead += zzFinalHighSurrogate;
            zzFinalHighSurrogate = 0;
        }

        /* fill the buffer with new input */
        int requested = zzBuffer.length - zzEndRead;
        int totalRead = 0;
        while (totalRead < requested) {
            int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
            if (numRead == -1) {
                break;
            }
            totalRead += numRead;
        }

        if (totalRead > 0) {
            zzEndRead += totalRead;
            if (totalRead == requested) {
                /* possibly more input available */
                if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
                    --zzEndRead;
                    zzFinalHighSurrogate = 1;
                }
            }
            return false;
        }

        // totalRead = 0: End of stream
        return true;
    }

    /**
     * Closes the input stream.
     */
    public final void yyclose() throws java.io.IOException {
        zzAtEOF = true;
        /* indicate end of file */
        zzEndRead = zzStartRead;
        /* invalidate buffer    */

        if (zzReader != null) {
            zzReader.close();
        }
    }

    /**
     * Resets the scanner to read from a new input stream. Does not close the
     * old reader.
     * <p>
     * All internal variables are reset, the old input stream
     * <b>cannot</b> be reused (internal buffer is discarded and lost). Lexical
     * state is set to <tt>ZZ_INITIAL</tt>.
     * <p>
     * Internal scan buffer is resized down to its initial length, if it has
     * grown.
     *
     * @param reader the new input stream
     */
    public final void yyreset(java.io.Reader reader) {
        zzReader = reader;
        zzAtBOL = true;
        zzAtEOF = false;
        zzEOFDone = false;
        zzEndRead = zzStartRead = 0;
        zzCurrentPos = zzMarkedPos = 0;
        zzFinalHighSurrogate = 0;
        yyline = yychar = yycolumn = 0;
        zzLexicalState = YYINITIAL;
        if (zzBuffer.length > ZZ_BUFFERSIZE) {
            zzBuffer = new char[ZZ_BUFFERSIZE];
        }
    }

    /**
     * Returns the current lexical state.
     */
    public final int yystate() {
        return zzLexicalState;
    }

    /**
     * Enters a new lexical state
     *
     * @param newState the new lexical state
     */
    public final void yybegin(int newState) {
        zzLexicalState = newState;
    }

    /**
     * Returns the text matched by the current regular expression.
     */
    public final String yytext() {
        return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
    }

    /**
     * Returns the character at position <tt>pos</tt> from the matched text.
     * <p>
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch. A value from 0 to
     * yylength()-1.
     * @return the character at position pos
     */
    public final char yycharat(int pos) {
        return zzBuffer[zzStartRead + pos];
    }

    /**
     * Returns the length of the matched text region.
     */
    public final int yylength() {
        return zzMarkedPos - zzStartRead;
    }

    /**
     * Reports an error that occurred while scanning.
     * <p>
     * In a wellformed scanner (no or only correct usage of yypushback(int) and
     * a match-all fallback rule) this method will only be called with things
     * that "Can't Possibly Happen". If this method is called, something is
     * seriously wrong (e.g. a JFlex bug producing a faulty scanner etc.).
     * <p>
     * Usual syntax/scanner level error handling should be done in error
     * fallback rules.
     *
     * @param errorCode the code of the errormessage to display
     */
    private void zzScanError(int errorCode) {
        String message;
        try {
            message = ZZ_ERROR_MSG[errorCode];
        } catch (ArrayIndexOutOfBoundsException e) {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }

    /**
     * Pushes the specified amount of characters back into the input stream.
     * <p>
     * They will be read again by then next call of the scanning method
     *
     * @param number the number of characters to be read again. This number must
     * not be greater than yylength()!
     */
    public void yypushback(int number) {
        if (number > yylength()) {
            zzScanError(ZZ_PUSHBACK_2BIG);
        }

        zzMarkedPos -= number;
    }

    /**
     * Resumes scanning until the next regular expression is matched, the end of
     * input is encountered or an I/O-Error occurs.
     *
     * @return the next token
     * @throws java.io.IOException if any I/O-Error occurs
     */
    public Token yylex() throws java.io.IOException {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        char[] zzBufferL = zzBuffer;
        char[] zzCMapL = ZZ_CMAP;

        int[] zzTransL = ZZ_TRANS;
        int[] zzRowMapL = ZZ_ROWMAP;
        int[] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
            zzMarkedPosL = zzMarkedPos;

            yychar += zzMarkedPosL - zzStartRead;

            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            zzState = ZZ_LEXSTATE[zzLexicalState];

            // set up zzAction for empty match case:
            int zzAttributes = zzAttrL[zzState];
            if ((zzAttributes & 1) == 1) {
                zzAction = zzState;
            }

            zzForAction:
            {
                while (true) {

                    if (zzCurrentPosL < zzEndReadL) {
                        zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
                        zzCurrentPosL += Character.charCount(zzInput);
                    } else if (zzAtEOF) {
                        zzInput = YYEOF;
                        break zzForAction;
                    } else {
                        // store back cached positions
                        zzCurrentPos = zzCurrentPosL;
                        zzMarkedPos = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL = zzCurrentPos;
                        zzMarkedPosL = zzMarkedPos;
                        zzBufferL = zzBuffer;
                        zzEndReadL = zzEndRead;
                        if (eof) {
                            zzInput = YYEOF;
                            break zzForAction;
                        } else {
                            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
                            zzCurrentPosL += Character.charCount(zzInput);
                        }
                    }
                    int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput]];
                    if (zzNext == -1) {
                        break zzForAction;
                    }
                    zzState = zzNext;

                    zzAttributes = zzAttrL[zzState];
                    if ((zzAttributes & 1) == 1) {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ((zzAttributes & 8) == 8) {
                            break zzForAction;
                        }
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
                case 1: {
                }
                case 17:
                    break;
                case 2: {
                    return token(TokenType.NEWLINE);
                }
                case 18:
                    break;
                case 3: {
                    return token(TokenType.COMMENT);
                }
                case 19:
                    break;
                case 4: {
                    return token(TokenType.WHITESPACE);
                }
                case 20:
                    break;
                case 5: {
                    yybegin(PARAMETERS);
                    return token(TokenType.KEYWORD);
                }
                case 21:
                    break;
                case 6: {
                    tokenLength += yylength();
                }
                case 22:
                    break;
                case 7: {
                    yybegin(YYINITIAL);
                    return token(TokenType.ERROR, tokenStart, tokenLength);
                }
                case 23:
                    break;
                case 8: {
                    yybegin(PARAMETERS);
                    // length also includes the trailing quote
                    return token(TokenType.STRING, tokenStart, tokenLength + 1);
                }
                case 24:
                    break;
                case 9: {
                    yybegin(YYINITIAL);
                    return token(TokenType.NEWLINE);
                }
                case 25:
                    break;
                case 10: {
                    return token(TokenType.IDENTIFIER);
                }
                case 26:
                    break;
                case 11: {
                    return token(TokenType.NUMBER);
                }
                case 27:
                    break;
                case 12: {
                    yybegin(STRING);
                    tokenStart = yychar;
                    tokenLength = 1;
                }
                case 28:
                    break;
                case 13: {
                    return token(TokenType.IDENTIFIER, yychar, yylength());
                }
                case 29:
                    break;
                case 14: {
                    tokenLength += 2;
                }
                case 30:
                    break;
                case 15: {
                    return token(TokenType.KEYWORD);
                }
                case 31:
                    break;
                case 16: {
                    return token(TokenType.KEYWORD2);
                }
                case 32:
                    break;
                default:
                    if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
                        zzAtEOF = true;
                        {
                            return null;
                        }
                    } else {
                        zzScanError(ZZ_NO_MATCH);
                    }
            }
        }
    }

}
