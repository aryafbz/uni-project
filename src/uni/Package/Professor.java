package uni.Package;

import java.util.ArrayList;

public class Professor {
    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<Professor>();
    public int personId;
    public int majorId;

    public Professor(int newPersonId, int newMajorId) {
        personId = newPersonId;
        majorId = newMajorId;
        professorList.add(this);
        id = professorList.size();
    }

    public static Professor findById(int id)
    {
        for (int i = professorList.size() - 1; i >= 0; i--)
        {
            if(professorList.get(i).id == id)
                return professorList.get(i);
        }
        return null;
    }
}
