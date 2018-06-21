package theaxontech.com.animatedrecyclerview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.github.clans.fab.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import theaxontech.com.animatedrecyclerview.Adapter.SuperherosAdapter;
import theaxontech.com.animatedrecyclerview.Model.Superhero;

public class MainActivity extends AppCompatActivity {

    private List<Superhero> superheroList = new ArrayList<>();
    private SuperherosAdapter mAdapter;
    private FloatingActionButton floatingActionFromBottomAnimButton, floatingActionFallDownAnimButton, floatingActionSlideRightAnimButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new SuperherosAdapter(superheroList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(mAdapter);

        prepareMovieData();

        floatingActionFromBottomAnimButton = findViewById(R.id.menu_item1);
        floatingActionFallDownAnimButton = findViewById(R.id.menu_item2);
        floatingActionSlideRightAnimButton = findViewById(R.id.menu_item3);

        floatingActionFromBottomAnimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runLayoutAnimationFromBottom(recyclerView);
            }
        });

        floatingActionFallDownAnimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runLayoutAnimationFallDown(recyclerView);
            }
        });

        floatingActionSlideRightAnimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runLayoutAnimationSlideRight(recyclerView);
            }
        });

    }

    private void runLayoutAnimationFromBottom(final RecyclerView recyclerView) {

        final Context context = recyclerView.getContext();
        final LayoutAnimationController controller =
                AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_from_bottom);

        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

    private void runLayoutAnimationFallDown(final RecyclerView recyclerView) {

        final Context context = recyclerView.getContext();
        final LayoutAnimationController controller =
                AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fall_down);

        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

    private void runLayoutAnimationSlideRight(final RecyclerView recyclerView) {

        final Context context = recyclerView.getContext();
        final LayoutAnimationController controller =
                AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_slide_right);

        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

    private void prepareMovieData() {

        superheroList.add(new Superhero("SPIDER-MAN",
                "Bitten by a radioactive spider, high school student Peter Parker gained the speed, strength and powers of a spider. Adopting the name Spider-Man, Peter hoped to start a career using his new abilities. Taught that with great power comes great responsibility, Spidey has vowed to use his powers to help people",
                R.drawable.spiderman));


        superheroList.add(new Superhero("CAPTAIN MARVEL",
                "Ms. Marvel's current powers include flight, enhanced strength, durability and the ability to shoot concussive energy bursts from her hands.",
                R.drawable.captainmarvel));

        superheroList.add(new Superhero("HULK",
                "Caught in a gamma bomb explosion while trying to save the life of a teenager, Dr. Bruce Banner was transformed into the incredibly powerful creature called the Hulk. An all too often misunderstood hero, the angrier the Hulk gets, the stronger the Hulk gets",
                R.drawable.hulk));

        superheroList.add(new Superhero("THOR",
                "As the Norse God of thunder and lightning, Thor wields one of the greatest weapons ever made, the enchanted hammer Mjolnir. While others have described Thor as an over-muscled, oafish imbecile, he's quite smart and compassionate. He's self-assured, and he would never, ever stop fighting for a worthwhile cause",
                R.drawable.thor));

        superheroList.add(new Superhero("IRON MAN",
                "Wounded, captured and forced to build a weapon by his enemies, billionaire industrialist Tony Stark instead created an advanced suit of armor to save his life and escape captivity. Now with a new outlook on life, Tony uses his money and intelligence to make the world a safer, better place as Iron Man",
                R.drawable.ironman));

        superheroList.add(new Superhero("LUKE CAGE",
                "Born and raised in Harlem, Carl Lucas spent his youth in a gang called the Bloods. With his friend Willis Stryker, he fought the rival gang the Diablos and committed petty thefts, often on behalf of deformed crimelord Sonny Caputo, a.k.a. Hammer",
                R.drawable.lukecage));

        superheroList.add(new Superhero("BLACK WIDOW",
                "Natasha Romanova, known by many aliases, is an expert spy, athlete, and assassin. Trained at a young age by the KGB's infamous Red Room Academy, the Black Widow was formerly an enemy to the Avengers. She later became their ally after breaking out of the U.S.S.R.'s grasp, and also serves as a top S.H.I.E.L.D. agent",
                R.drawable.blackwidow));

        superheroList.add(new Superhero("DAREDEVIL",
                "Abandoned by his mother, Matt Murdock was raised by his father, boxer Battling Jack Murdock, in Hell's Kitchen. Realizing that rules were needed to prevent people from behaving badly, young Matt decided to study law; however, when he saved a man from an oncoming truck, it spilled a radioactive cargo that rendered Matt blind while enhancing his remaining senses. Under the harsh tutelage of blind martial arts master Stick, Matt mastered his heightened senses and became a formidable fighter",
                R.drawable.daredevil));

        superheroList.add(new Superhero("CAPTAIN AMERICA",
                "Vowing to serve his country any way he could, young Steve Rogers took the super soldier serum to become America's one-man army. Fighting for the red, white and blue for over 60 years, Captain America is the living, breathing symbol of freedom and liberty",
                R.drawable.captainamerica));

        superheroList.add(new Superhero("WOLVERINE",
                "Born with super-human senses and the power to heal from almost any wound, Wolverine was captured by a secret Canadian organization and given an unbreakable skeleton and claws. Treated like an animal, it took years for him to control himself. Now, he's a premiere member of both the X-Men and the Avengers",
                R.drawable.wolverine));

        mAdapter.notifyDataSetChanged();

    }
}