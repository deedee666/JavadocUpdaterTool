package org.adoptopenjdk;

/*
 * Copyright (c) 2013 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * License Agreement
 *
 * PLEASE READ THE FOLLOWING LICENSE TERMS CAREFULLY BEFORE USING THE
 * ACCOMPANYING PROGRAM. THESE TERMS CONSTITUTE A LEGAL AGREEMENT BETWEEN
 * YOU AND US.
 *
 * "Oracle" refers to Oracle America, Inc., for and on behalf of itself and its
 * subsidiaries and affiliates under common control.  "We," "us," and "our"
 * refers to Oracle and any Program contributors. "You" and "your" refers to
 * the individual or entity that wishes to use the Program. "Program" refers to
 * the Java API Documentation Updater Tool, Copyright (c) 2013, Oracle America,
 * Inc., and updates or error corrections provided by Oracle or contributors.
 *
 * WARNING:
 * The Program will analyze directory information on your computer
 * system and may modify software components on such computer system.  You
 * should only use the Program on computer systems that you maintain sufficient
 * rights to update software components.
 *
 * If your computer system is owned by a person or entity other than you,
 * you should check with such person or entity before using the Program.
 *
 * It is possible that you may lose some software functionality, and make
 * Java API Documentation pages unusable on your computer system after you use
 * the Program to update software components.
 *
 * License Rights and Obligations
 * We grant you a perpetual, nonexclusive, limited license to use, modify and
 * distribute the Program in binary and/or source code form, only for the
 * purpose of analyzing the directory structure of your computer system and
 * updating Java API Documentation files.  If you distribute the Program, in
 * either or both binary or source form, including as modified by you, you
 * shall include this License Agreement ("Agreement") with your distribution.
 *
 * All rights not expressly granted above are hereby reserved. If you want to
 * use the Program for any purpose other than as permitted under this
 * Agreement, you must obtain a valid license permitting such use from Oracle.
 * Neither the name of Oracle nor the names of any Program contributors may be
 * used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * Ownership and Restrictions
 * We retain all ownership and intellectual property rights in the Program as
 * provided by us. You retain all ownership and intellectual property rights
 * in your modifications.
 *
 * Export
 * You agree to comply fully with export laws and regulations of the United
 * States and any other applicable export laws ("Export Laws") to assure that
 * neither the Program nor any direct products thereof are:  (1) exported,
 * directly or indirectly, in violation of this Agreement or Export Laws; or
 * (2) used for any purposes prohibited by the Export Laws, including, without
 * limitation, nuclear, chemical, or biological weapons proliferation, or
 * development of missile technology.
 *
 * Disclaimer of Warranty and Limitation of Liability
 * THE PROGRAM IS PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND. USE AT YOUR
 * OWN RISK.  WE FURTHER DISCLAIM ALL WARRANTIES, EXPRESS AND IMPLIED,
 * INCLUDING WITHOUT LIMITATION, ANY IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE OR NONINFRINGEMENT.
 *
 * IN NO EVENT SHALL WE BE LIABLE FOR ANY INDIRECT, DIRECT, INCIDENTAL,
 * SPECIAL, PUNITIVE OR CONSEQUENTIAL DAMAGES, OR DAMAGES FOR LOSS OF PROFITS,
 * REVENUE, DATA OR DATA USE, INCURRED BY YOU OR ANY THIRD PARTY, WHETHER IN AN
 * ACTION IN CONTRACT OR TORT, EVEN IF WE HAVE BEEN ADVISED OF THE POSSIBILITY
 * OF SUCH DAMAGES.  ORACLE SHALL HAVE NO LIABILITY FOR MODIFICATIONS MADE BY
 * YOU OR ANY THIRD PARTY.
 *
 * Entire Agreement
 * You agree that this Agreement is the complete agreement for the Program, and
 * this Agreement supersedes all prior or contemporaneous agreements or
 * representations. If any term of this Agreement is found to be invalid or
 * unenforceable, the remaining provisions will remain effective. This
 * Agreement is governed by the substantive and procedural laws of California.
 * You and Oracle agree to submit to the exclusive jurisdiction of, and venue
 * in, the courts of San Francisco or Santa Clara counties in California in
 * any dispute between you and Oracle arising out of or relating to this
 * Agreement.
 *
 * Last updated: 14 June 2013
 */

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
