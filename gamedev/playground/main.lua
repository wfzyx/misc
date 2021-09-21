Input = require 'input'

function love.load()
	world = wf.newWorld(0, 0, true)
	world:setGravity(0, 512)

    world:addCollisionClass('Player')
    -- world:addCollisionClass('Ghost', {ignores = {'Solid'}})

    player = world:newRectangleCollider(400 - 100, 0, 50, 50)
    player =

    ground = world:newRectangleCollider(0, 550, 800, 50)
    ground:setType('static')

    wall = world:newRectangleCollider(550, 0 , 50, 800)
    wall:setType('static')

    input = Input()
    input:bind('a', 'move_left')
    input:bind('d', 'move_right')
    input:bind('space', 'jump')
end

function love.update(dt)
	world:update(dt)
	if input:down("move_right") then
		player.speed = 
	    player:setX(player:getX() + 330 * dt)
    elseif input:down("move_left") then
	    player:setX(player:getX() - 330 * dt)
	end
    if input:pressed("jump") then
	    player:setPosition(325, 325)
	    player:setLinearVelocity(0, 0) 
	end
end

function love.draw()
    world:draw()
end