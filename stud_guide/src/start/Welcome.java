package start;

import start.After12Arts.AfterArt;
import start.AfterClass10.Arts;
import start.AfterClass10.Commerce;
import start.AfterClass10.Science;
import start.AfterClass12.Engineering;
import start.AfterClass12.Medical;
import start.AfterClass12commerce.AFterCOM;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        welcome();
        intro();
        work();
        mistakes();
        String quali1="10th";
        String quali2="12th science";
        String quali3="12th commerce";
        Scanner jc=new Scanner(System.in);
        System.out.println("Please tell us your qualification");
        String yourqual=jc.nextLine();
        if (yourqual.equalsIgnoreCase(quali1)) {

            Arts a = new Arts();
            a.whatisArts();
            a.forwhowArtsis();

            Science s = new Science();
            s.WhatisScience();
            s.forwhowScienceis();

            Commerce c = new Commerce();
            c.whatisCommerce();
            c.forwhowCommerceis();
        }else if (yourqual.equalsIgnoreCase(quali2)){
            Engineering d = new Engineering();
            d.Whatisengineering();
            d.listofengineering();

            Medical v =new Medical();
            v.WhatisMedical();
            v.coursesinMedical();
        }else if (yourqual.equalsIgnoreCase(quali3)){
            AFterCOM m =new AFterCOM();
            m.careeraftercom();

        }
        else {
            AfterArt q=new AfterArt();
            q.careerAfter12arts();
        }
        if (yourqual.equalsIgnoreCase(quali1)) {

            String name;
            int Science, Maths, Socialstudies, English, Hindi;
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------------------------");
            System.out.println("HELLO WELCOME TO CAREER GUIDANCE");
            System.out.println("Please tell us your name");
            name = sc.nextLine();
            System.out.println("---------------------------------------------------");
            System.out.println("OK \t" + name + "\tAnswer us yours acadamic Marks as asked below");
            System.out.println("MARKS SCORED IN SCIENCE");
            Science = sc.nextInt();
            System.out.println("MARKS SCORED IN MATHS");
            Maths = sc.nextInt();
            System.out.println("MARKS SCORED IN SOCIALSTUDIES");
            Socialstudies = sc.nextInt();
            System.out.println("MARKS SCORED IN ENGLISH");
            English = sc.nextInt();
            System.out.println("MARKS SCORED IN HINDI");
            Hindi = sc.nextInt();
            int R1 = Science + Maths + English;
            int R2 = Socialstudies + Maths + English;
            int R3 = Hindi + Maths + English;
            if (R1 >= R2 && R1 >= R3) {

                System.out.println(name + "Your Score is very good \n" +
                        "Looking at your score we feel you have a good understanding in Science\n" +
                        "We Suggest you to go for Science after 10th");

            } else if (R2 >= R1 && R2 >= R3) {

                System.out.println(name + "Your Score is very good \n" +
                        "Looking at your score we feel you have a good understanding in Mathematics\n" +
                        "We Suggest you to go for Commerce after 10th");

            } else {
                System.out.println(name + "Your Score is very good \n" +
                        "Looking at your score we feel you have a good understanding in Arts\n" +
                        "We Suggest you to go for Arts after 10th");
            }


            Scanner dc = new Scanner(System.in);
            String coms = "commerce";
            String sci = "science";
            String art = "arts";

            System.out.println("choose your sub");
            String yourchoice = dc.nextLine();
            if (yourchoice.equalsIgnoreCase(coms)) {
                System.out.println();
                System.out.println("This are the best colleges for commerce");
            } else if (yourchoice.equalsIgnoreCase(art)) {
                System.out.println();
                System.out.println("This are the best colleges for arts");
            } else {
                System.out.println();
                System.out.println("This Are the best colleges for  science");
            }
        }else {
            System.out.println("You can.............");
        }


    }
    static void welcome(){
        System.out.println();
        System.out.println();
        System.out.println("    Welcome to Career World counseling centre...." +
                "\n After 10th results are out, there is one common question that strikes in every student’s mind “ " +
                "What next after 10th”? Science, Commerce or Arts? This is a common confusion which most of the students face." +
                "Every field has a lot of career opportunities but choosing the right stream which students are interested " +
                "should be the main concern. ");
    }
    static void intro(){
        System.out.println();
        System.out.println("   According to CBSE, nearly 32 lakhs of students appeared for 10th board exams. That’s a huge" +
                "number." + "But how many students are actually aware of what to do after 10th? Career counselling and" +
                "career guidance" + "for 10th class is the need of the hour." + " Students who are confused about their" +
                "stream selection" + "can go for career counselling. Career counselling for 10th class students is" +
                "extremely important as" + "today’s youth are tomorrow’s future." + "\n" +
                "“Padhega India tabhi toh badhega India.” ");
        System.out.println();
        System.out.println("& here We are for your Help to find the best career path.... ");
    }

    static void work(){
        System.out.println();
        System.out.println("  Why you need career counsellor??");
        System.out.println("  A lot of options but choosing the right career after 10th is very crucial." +
                "Career counselling with a trained career counsellor can help you solve your confusion." +
                "A career counsellor uses career assessment to derive a perfect career path for your future." +
                "Career assessment test analyses your skills, interest, abilities and based on that a clear roadmap" +
                "is provided."
        );
    }

    static void mistakes(){
        System.out.println();
        System.out.println("Mistakes  students make while choosing their career : ");
        System.out.println("1. Following the crowd/friends – ");
        System.out.println("This is one of the most common mistakes which most of the students unknowingly make." +
                "Many students just take up any stream because their friends have decided to take that stream." +
                "This can turn out to be the worst decision of their lives." +
                "It is necessary that you chose the stream which you are most passionate about rather than doing " +
                "what most of the students are doing.");
        System.out.println();
        System.out.println("2. Parental/Societal pressure – ");
        System.out.println("Let’s look at a common scenario." +
                "You: Dad, I want to take up Arts stream." +
                "Dad: There is no future in the Arts stream. You have to take up science. Look at Sharma Jis son. " +
                "He had taken up science stream and he is doing very well in life." +
                "I am sure many students would have faced this situation. I am sure, that many parents would have given" +
                "the examples of some Sharma or Gupta to influence the decision of their child. This can lead to a" +
                "flawed career decision." +
                "It might look like that science stream is everything. But if you get proper career guidance from " +
                "an expert (career counsellor), choosing a career path after 10th will be much easier.");
        System.out.println();
        System.out.println("3. Lack of knowledge – ");
        System.out.println("There are a plethora of career options after 10th. If we go back 10-20 years ago, there were" +
                "very fewer career options to choose from. But now the scenario is completely different." +
                "There are many career options available and with the help of proper career guidance and career" +
                "counselling, you can see the light at the end of the tunnel.");


    }


    class arts extends Arts {
        @Override
        public void whatisArts() {
            super.whatisArts();
        }
    }

    class science extends Science {
        @Override
        public void WhatisScience() {
            super.WhatisScience();
        }
    }
    class commerce extends Commerce {
        @Override
        public void whatisCommerce() {
            super.whatisCommerce();
        }
    }

    class engineering extends Engineering{
        @Override
        public void Whatisengineering(){super.Whatisengineering();}
    }
    class medical extends Medical{
        @Override
        public void WhatisMedical(){super.WhatisMedical();}
    }
    class aftercom extends AFterCOM{
        @Override
        public void careeraftercom(){super.careeraftercom();}
    }
    class afterart extends AfterArt{
        @Override
        public void careerAfter12arts(){super.careerAfter12arts();}
    }




}

