package com.mythri.game_app.controller;

// package com.mtd.gaming_club_app.controller;

import com.mythri.game_app.entity.Recharge;
import com.mythri.game_app.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recharges")
public class RechargeController {

    @Autowired
    private RechargeService rechargeService;

    @GetMapping
    public List<Recharge> getAllRecharges() {
        return rechargeService.getAllRecharges();
    }

    @PostMapping
    public Recharge createRecharge(@RequestBody Recharge recharge) {
        return rechargeService.createRecharge(recharge);
    }

    @GetMapping("/member/{memberId}")
    public List<Recharge> getRechargesByMember(@PathVariable String memberId) {
        return rechargeService.getRechargesByMember(memberId);
    }
}

