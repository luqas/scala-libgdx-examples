package com.rathboma.playpen

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.rathboma.playpen.box2dcharacter.Box2DPlayerScreen

class PlaypenGame extends Game {

  override def create {
    setScreen(new Box2DPlayerScreen(this))
  }

}