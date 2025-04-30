public class AdminInterface {




    public void checkPause( Show show1, Show show2){

        if (show1.getStartTime().plusMinutes(show1.getMovie().getDuration()+15).isAfter(show2.getStartTime())){
            throw new IllegalArgumentException("There need to be  at least 15 minutes between the end of a Movie and the Start of the next one in the Same room");
        }

    }



}

