import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void squad_instantiates_Correctly_true(){
        Squad squad = new Squad("wonder woman","save people",12);
        assertTrue(squad instanceof Squad);
    }
    @Test
    public void squad_instantiates_withName_String() {
        Squad squad = new Squad("wonder woman", "save people", 2);
        assertEquals("wonder woman",squad.getName());
    }
    @Test
    public void squad_instantiates_withCause_String(){
        Squad squad = new Squad("wonder woman","save people",2);
        assertEquals("save people",squad.getCause());
    }
    @Test
    public void squad_instantiates_WithMaximum_int(){
        Squad squad = new Squad("wonder woman","save people",2);
        assertEquals(2,squad.getMaximum());
    }
    @Test
    //use of static getAll method
    public void squad_ReturnAll_instancesOfSquad_true(){
        Squad squad = new Squad("wonder woman","save people",2);
        Squad mSquad = new Squad(" "," ",2);
        assertEquals(true,Squad.getAll().contains(squad));
        assertEquals(true,Squad.getAll().contains(mSquad));
    }
    //Clear all the instantiates in Squad List
    @Test
    public void squad_clearAllSquadList_instances_0(){
        Squad squad = new Squad("wonder woman","save people",2);
        Squad.clearAllSquad();
        assertEquals(Squad.getAll().size(),0);
    }
    //instantiates squad with an id
    @Test
    public void squad_squadInstantiates_withId_1(){
        Squad.clearAllSquad();
        Squad squad = new Squad("wonder woman","save people",2);
        assertEquals(1,squad.getId());
    }
    @Test
    public void squad_getsSquadWithSameId_Squad2(){
        Squad squad = new Squad("wonder woman","save people",2);
        Squad sndSquad = new Squad("nea","code",5);
        assertEquals(Squad.findById(sndSquad.getId()),sndSquad);
    }
    @Test
    public void squad_getTasks_initiallyReturnsEmptyList_ArrayList(){
        Squad squad = new Squad("wonder woman","save people",2);
        assertEquals(0,squad.getHeroes().size());
    }
    //add hero to the squadList
    @Test
    public void squad_able_toAddTaskToTheList_true(){
        Squad mSquad = new Squad("wonder woman","save people",2);
        Hero mHero = new Hero(" ",24," "," ");
        mSquad.addHero(mHero);
        assertEquals(true,mSquad.getHeroes().contains(mHero));
    }


}