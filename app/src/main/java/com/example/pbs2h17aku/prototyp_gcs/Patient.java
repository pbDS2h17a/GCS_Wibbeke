package com.example.pbs2h17aku.prototyp_gcs;

/**
 * Created by pbs2h17asc on 27.11.2018.
 */

public class Patient {

    int visualReaction;
    int verbalReaction;
    int physicalReaction;

    enum Eyes {
        NO_REACTION(1), ON_PAIN(2), ON_DEMAND(3), SPONTANEOUS(4);

        private String[] cases = {
                "Der Patient öffnet die Augen nicht, ",
                "Der Patient öffnet die Augen auf Schmerzreiz, ",
                "Der Patient öffnet die Augen auf Aufforderung, ",
                "Der Patient öffnet die Augen spontan, "
        };

        private int value;

        Eyes(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return cases[(this.value-1)];
        }

        public static int maxValue() {
            int max = 0;

            for (Eyes e : Eyes.values()) {
                if(e.value > max) max = e.value;
            }

            return max;
        }
    }

    enum VerbalCommunication {
        NO_REACTION(1), NOT_UNDERSTANDABLE(2), UNCONNECTED(3), DESORIENTATED(4), ORIENTATED(5);

        private String[] cases = {
                "zeigt keine verbale Reaktion ",
                "gibt unverständliche Laute von sich ",
                "sagt unzusammenhängende Worte ",
                "ist konversationsfähig, jedoch desorientiert ",
                "ist konversationsfähig und orientiert "
        };

        private int value;

        VerbalCommunication(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return cases[(this.value-1)];
        }

        public static int maxValue() {
            int max = 0;

            for (VerbalCommunication v : VerbalCommunication.values()) {
                if(v.value > max) max = v.value;
            }

            return max;
        }
    }

    enum MotorResponse {
        NO_REACTION(1), ON_PAIN_AND_STRETCH(2), ON_PAIN_AND_BEND(3), UNTARGETED_REPULSE(4), TARGETED_REPULSE(5), FOLLOWS_DEMAND(6);

        private int value;

        private String[] cases = {
                " und zeigt keine Reaktion auf Schmerzreize.",
                " und reagiert auf Schmerz mit Strecksynergismen.",
                " und reagiert auf Schmerz mit Beugesynergismen.",
                " und wehrt Schmerz ungezielt ab.",
                " und wehrt Schmerz gezielt ab.",
                " und befolgt Aufforderungen motorisch."
        };

        MotorResponse(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return cases[(this.value-1)];
        }

        public static int maxValue() {
            int max = 0;

            for (MotorResponse m : MotorResponse.values()) {
                if(m.value > max) max = m.value;
            }

            return max;
        }
    }

    public Patient() {
        this.visualReaction = (int)(Math.random() * Eyes.maxValue() + 1);
        this.verbalReaction = (int)(Math.random() * VerbalCommunication.maxValue() + 1);
        this.physicalReaction = (int)(Math.random() * MotorResponse.maxValue() + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(Eyes.values()[visualReaction-1].toString());
        sb.append(VerbalCommunication.values()[verbalReaction-1].toString());
        sb.append(MotorResponse.values()[physicalReaction-1].toString());

        return sb.toString();
    }

    public int gcsValue() {
        return visualReaction+verbalReaction+physicalReaction;
    }
}


