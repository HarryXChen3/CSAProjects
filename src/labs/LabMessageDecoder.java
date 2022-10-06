package labs;

public class LabMessageDecoder {
    // This is a mess and I know it...my teacher has forced my hand (it's how he wants it...)
    public static void main(final String[] args) {
        final String m1 = "ThCiw^isIs4SecN3]Qfb7Mess4g3!";
        final String m2 = "?upKUDr.jeXkR?edy_Aw5=me4";
        final String m3 = "!!!1u1hUjly0U__pkMDiD_It!!";
        final String m4 = "M5ell0,T54tsppAl:oA72";
        final String m5 = "2.HrsthIsuhK\\!To0K_M3+";
        final String m6 = "Qi:yvL3Fj3s\\\"\\\"Y";

        System.out.println("\nHarry Chen\n");
        //print first encoded message
        String m_1 = m1;
        System.out.println(m_1);
        //print each decoding step
        System.out.println(m_1 = m_1.replace('N', 'r'));
        System.out.println(m_1 = m_1.replace(']', 't'));
        System.out.println(m_1 = m_1.replace('7', '5'));
        System.out.println(m_1 = m_1.substring(0, 17) + m_1.substring(21));
        System.out.println(m_1 = m_1.substring(0, 2) + m_1.substring(6));
        System.out.println("---------------------");
        //print second encoded message
        String m_2 = m2;
        System.out.println(m_2);
        //print each decoding step
        System.out.println(m_2 = m_2.substring(5, m_2.length() - 1));
        System.out.println(m_2 = m_2.replace('?', 'e'));
        System.out.println(m_2 = m_2.replace('=', 'o'));
        System.out.println(m_2 = m_2.replace('5', 's'));
        System.out.println(m_2 = m_2.substring(0, 3) + m_2.substring(7));
        System.out.println("---------------------");

        //print third encoded message
        String m_3 = m3;
        System.out.println(m_3);
        //print each decoding step
        System.out.println(m_3 = m_3.substring(0, 15) + m_3.substring(18));
        System.out.println(m_3 = m_3.substring(4) + m_3.substring(0, 4));
        System.out.println(m_3 = m_3.substring(6, m_3.length() - 1));
        System.out.println("---------------------");

        //print forth encoded message
        String m_4 = m4;
        System.out.println(m_4);
        //print each decoding step
        System.out.println(m_4 = m_4.substring(m_4.length() - 3) + m_4.substring(0, m_4.length() - 3));
        System.out.println(m_4 = m_4.substring(4, m_4.length() - 1));
        System.out.println(m_4 = m_4.replace('p', '_'));
        System.out.println(m_4 = m_4.replace('5', 'H'));
        System.out.println(m_4 = m_4.replace(':', '1'));
        System.out.println("---------------------");

        //print fifth encoded message
        String m_5 = m5;
        System.out.println(m_5);
        //print each decoding step
        System.out.println(m_5 = m_5.substring(m_5.length() - 4) + m_5.substring(0, m_5.length() - 4));
        System.out.println(m_5 = m_5.substring(9) + m_5.substring(0, 9));
        System.out.println(m_5 = m_5.substring(0, 4) + m_5.substring(8));
        System.out.println("---------------------");

        //print sixth encoded message
        String m_6 = m6;
        System.out.println(m_6);
        //print each decoding step
        System.out.println(m_6 = m_6.substring(3) + m_6.substring(0, 3));
        System.out.println(m_6 = m_6.substring(6, m_6.length() - 3));
        System.out.println(m_6 = m_6.substring(m_6.length() - 2) + m_6.substring(0, m_6.length() - 2));
        //print the decrypted messages
        System.out.printf("1: %s\n2: %s\n3: %s\n4: %s\n5: %s\n6: %s%n", m_1, m_2, m_3, m_4, m_5, m_6);
    }
}
